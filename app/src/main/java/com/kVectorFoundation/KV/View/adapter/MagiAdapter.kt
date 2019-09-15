package com.kVectorFoundation.KV.View.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.Model.MagList
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.View.Activity.ArticleActivity
import com.kVectorFoundation.KV.Model.MagiModel
import com.squareup.picasso.Picasso
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.row_magi.view.*
import kotlin.random.Random

class MagiAdapter (var magazineList:List<MagList>, var context:Context): RecyclerView.Adapter<MagiHolder>(){
    override fun onBindViewHolder(holder: MagiHolder, position: Int) {
       holder.onBind(magazineList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagiHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_magi, parent, false)
        return MagiHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineList.size
    }

//     private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
//        return Random.nextInt(min,max)
//    }


}


class MagiHolder (view: View) : RecyclerView.ViewHolder(view) {
    fun onBind(MagList:MagList){
        val articalTV=itemView.findViewById<TextView>(R.id.articleTitle)
        val articalImage=itemView.findViewById<ImageView>(R.id.articleImage)
        articalTV.text=MagList.title
        //Picasso.get().load(MagList.image).into(articalImage)

    }
}