package com.communityteam.mycommunity.ui.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.communityteam.mycommunity.R
import com.communityteam.mycommunity.databinding.FragmentScheduleBinding
import com.communityteam.mycommunity.repository.ViewModelFactory

class ScheduleFragment : Fragment() {

    private val viewModel: ScheduleViewModel by lazy {
        ViewModelProvider(this, ViewModelFactory()).get(ScheduleViewModel::class.java)
    }

    private var _binding: FragmentScheduleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScheduleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}