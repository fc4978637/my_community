package com.communityteam.mycommunity.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.communityteam.mycommunity.model.Event
import java.time.LocalDateTime
import java.util.*

class DashBoardViewModel : ViewModel() {

    private val _event = MutableLiveData<List<Event>>()
    val event: LiveData<List<Event>> = _event

    fun creatMockEvent() {
        val mockEvents = arrayListOf<Event>()
        val c = Calendar.getInstance()
        val date = c.get(Calendar.MONTH).toString() + "/" + c.get(Calendar.DATE) + "/" + c.get(Calendar.YEAR)

        for (i in 0..10) {
            val event = Event(i.toString(),
                date,
                getRandomString(i * 20)
            )
            mockEvents.add(event)
        }
        _event.value = mockEvents
    }

    private fun getRandomString(length: Int) : String {
        val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}