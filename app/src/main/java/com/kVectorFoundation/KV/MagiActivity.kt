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

        addtimline()
        var magazineView :RecyclerView = findViewById(R.id.recyclerView)
        magazineView.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        magazineView.adapter = MagiAdapter(timeline)



    }

    fun addtimline(){

        timeline.add(mag(1,20,R.drawable.android,"first"))
        timeline.add(mag(2,25,R.drawable.android3,"second"))
        timeline.add(mag(1,20,R.drawable.android4,"first"))
        timeline.add(mag(2,25,R.drawable.android2,"second"))
        timeline.add(mag(1,20,R.drawable.android5,"first"))
        timeline.add(mag(2,25,R.drawable.android1,"second"))
        timeline.add(mag(3,23,R.drawable.pass,"third"))

        timeline.add(mag(1,20,R.drawable.android,"first"))
        timeline.add(mag(2,25,R.drawable.android3,"second"))
        timeline.add(mag(1,20,R.drawable.android4,"first"))
        timeline.add(mag(2,25,R.drawable.android2,"second"))
        timeline.add(mag(1,20,R.drawable.android5,"first"))
        timeline.add(mag(2,25,R.drawable.android1,"second"))
        timeline.add(mag(1,20,R.drawable.android,"first"))
        timeline.add(mag(2,25,R.drawable.android3,"second"))
        timeline.add(mag(1,20,R.drawable.android4,"first"))
        timeline.add(mag(2,25,R.drawable.android2,"second"))
        timeline.add(mag(1,20,R.drawable.android5,"first"))
        timeline.add(mag(2,25,R.drawable.android1,"second"))
    }
}

