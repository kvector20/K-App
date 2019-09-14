package com.kVectorFoundation.KV.View.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.View.Activity.ArticleActivity
import kotlinx.android.synthetic.main.event_receycler.view.*

class EventAdapter(val address: String,val Discraption:String):RecyclerView.Adapter<EventHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHolder {
        val intent = Intent(parent.context, ArticleActivity::class.java)
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.event_receycler, parent, false)
        return EventHolder(view)


    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: EventHolder, position: Int) {
        holder.itemView.eventDiscribtionTV.text=Discraption
        holder.itemView.eventAddresTV.text=address
    }

}


class EventHolder (view: View) : RecyclerView.ViewHolder(view) {

}