package com.kVectorFoundation.KV.View.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.View.adapter.EventAdapter
import com.kVectorFoundation.KV.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        val adapter=GroupAdapter<ViewHolder>()
        val recyclerView=findViewById<RecyclerView>(R.id.eventRecyclerView)
        recyclerView.adapter=adapter
    }
}
