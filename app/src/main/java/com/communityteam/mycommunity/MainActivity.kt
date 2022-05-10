package com.communityteam.mycommunity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.communityteam.mycommunity.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val navHostFragment: NavHostFragment
        get() = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

    private val navController: NavController
        get() = navHostFragment.navController

    private val navView: BottomNavigationView
        get() = binding.navView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with (NavigationUI) {
            setupWithNavController(navView, navController)
            setupActionBarWithNavController(this@MainActivity, navController)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}