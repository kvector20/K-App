package com.kVectorFoundation.KV.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.Model.EventModel
import com.kVectorFoundation.KV.R
import com.squareup.picasso.Picasso

class EventAdapter(var eventList:List<EventModel>):RecyclerView.Adapter<EventHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.event_receycler, parent, false)
        return EventHolder(view)


    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    override fun onBindViewHolder(holder: EventHolder, position: Int) {
        holder.onBind(eventList[position])
    }

}


class EventHolder (view: View) : RecyclerView.ViewHolder(view) {
    fun onBind(eventList:EventModel){
        val title=itemView.findViewById<TextView>(R.id.eventTitleTV)
        val description=itemView.findViewById<TextView>(R.id.eventDiscriptionTV)
        val eventImage=itemView.findViewById<ImageView>(R.id.eventImage)
        title.text=eventList.address
        description.text=eventList.Descraption
        Picasso.get().load(eventList.image).into(eventImage)

    }

}