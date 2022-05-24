package com.communityteam.mycommunity.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.communityteam.mycommunity.databinding.DashBoardEventItemBinding
import com.communityteam.mycommunity.model.Event

class DashBoardEventAdapter : RecyclerView.Adapter<DashBoardEventAdapter.DashBoardEventViewHolder>() {

    private val events = mutableListOf<Event>()

    fun setEvents(eventList: List<Event>) {
        events.clear()
        events.addAll(eventList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashBoardEventViewHolder {
        return DashBoardEventViewHolder(
            DashBoardEventItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DashBoardEventViewHolder, position: Int) {
        holder.bind(events[position])
    }

    override fun getItemCount(): Int {
        return events.size
    }

    inner class DashBoardEventViewHolder(private val binding: DashBoardEventItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(event: Event) {
            with (binding) {
                evenTitle.text = event.title
                dateTextView.text = event.date.toString()
                eventItemDescriptionContent.text = event.content
            }
        }
    }
}