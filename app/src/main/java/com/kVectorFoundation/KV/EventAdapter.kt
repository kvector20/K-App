package com.kVectorFoundation.KV

import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.event_receycler.view.*

class EventAdapter(val addres:String,val Discraption:String): Item<ViewHolder>() {
    override fun getLayout(): Int =R.layout.event_receycler

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.eventAddresTV.text=addres
        viewHolder.itemView.eventDiscribtionTV.text=Discraption

    }

}