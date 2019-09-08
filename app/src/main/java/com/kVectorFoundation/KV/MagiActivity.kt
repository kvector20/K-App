package com.kVectorFoundation.KV

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kVectorFoundation.KV.model.mag
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

class MagiActivity : AppCompatActivity() {
    var timeline:ArrayList<mag> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magi)
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)

        addtimline()
        var magazineView :RecyclerView = findViewById(R.id.recyclerView)
        magazineView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        magazineView.adapter = MagiAdapter(timeline)



    }

    fun addtimline(){

        timeline.add(mag(1,20,R.drawable.ic_menu_manage,"first"))
        timeline.add(mag(2,25,R.drawable.custom,"second"))
        timeline.add(mag(3,23,R.drawable.ic_launcher_background,"third"))
        timeline.add(mag(4,2,R.drawable.ic_home_black_24dp,"fourth"))
        timeline.add(mag(5,2,R.drawable.event_row,"fifth"))
        timeline.add(mag(6,2,R.drawable.ic_menu_camera,"six"))
        timeline.add(mag(7,2,R.drawable.ic_menu_send,"seven"))

    }
}

