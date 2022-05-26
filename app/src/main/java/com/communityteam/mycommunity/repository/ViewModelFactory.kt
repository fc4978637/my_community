package com.communityteam.mycommunity.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.communityteam.mycommunity.ui.home.DashBoardViewModel
import com.communityteam.mycommunity.ui.schedule.ScheduleViewModel

class ViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        when (modelClass) {
            DashBoardViewModel::class.java -> return DashBoardViewModel() as T
            ScheduleViewModel::class.java -> return ScheduleViewModel() as T
            else -> {
                throw IllegalStateException("Unknow ViewModel")
            }
        }
    }
}