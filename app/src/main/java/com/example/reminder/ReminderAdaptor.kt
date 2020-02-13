package com.example.reminder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_reminder.view.*

class ReminderAdaptor(private  val reminders: List<Reminder>) : RecyclerView.Adapter<ReminderAdaptor.ViewHolder>() {
    override fun getItemCount(): Int {
        return reminders.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(reminders[position])

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_reminder, parent, false)
        )

    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(reminder: Reminder){
            itemView.tvReminder.text = reminder.reminderText
        }
    }
}