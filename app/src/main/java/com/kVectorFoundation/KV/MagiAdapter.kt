package com.kVectorFoundation.KV

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.model.mag
import com.squareup.picasso.Picasso
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.row_magi.view.*
import kotlin.random.Random

class MagiAdapter (var magazineList:ArrayList<mag>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val intent = Intent(parent.context,ArticleActivity::class.java)
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_magi, parent, false)
        view.setOnClickListener{
            startActivity(parent.context,intent, Bundle())
        }
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var modelMag:mag = magazineList.get(position)
        holder.itemView.articleTitle.text=modelMag.title
        holder.itemView.layoutParams.height=getRandomIntInRange()
        var pic: ImageView =holder.itemView.findViewById(R.id.articleImage)
        Picasso.get().load(modelMag.image).into(pic)


    }


     private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
        return Random.nextInt(min,max)
    }


}