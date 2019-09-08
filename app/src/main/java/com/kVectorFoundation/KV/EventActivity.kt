package com.kVectorFoundation.KV

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
        val adapter=GroupAdapter<ViewHolder>()
        val recyclerView=findViewById<RecyclerView>(R.id.eventRecyclerView)

        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))
        adapter.add(EventAdapter("1sjddddddd","dsjfffffffffffffffffffffffsdklffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"))

        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))
        adapter.add(EventAdapter("",""))

        recyclerView.adapter=adapter
    }
}
