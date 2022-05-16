package com.communityteam.mycommunity.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.communityteam.mycommunity.R

class DashBoardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash_board , container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    // test
    /**
     * 1. make change in files
     * 2. stage the change
     * 3. commit
     * 4. push
     */
}