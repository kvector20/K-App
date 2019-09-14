package com.kVectorFoundation.KV.View.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.View.Activity.ArticleActivity
import com.kVectorFoundation.KV.Model.MagiModel
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.row_magi.view.*
import kotlin.random.Random

class MagiAdapter (var magazineList:List<MagiModel>, var context:Context): RecyclerView.Adapter<MagiHolder>(){
    override fun onBindViewHolder(holder: MagiHolder, position: Int) {
        val modelMagiModel:MagiModel = magazineList.get(position)
        holder.itemView.articleTitle.text= modelMagiModel.data?.get(position)?.title
        holder.itemView.layoutParams.height=getRandomIntInRange()
        val pic: ImageView =holder.itemView.findViewById(R.id.articleImage)
        //Picasso.get().load(modelMagiModel.image).into(pic)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagiHolder {
        val intent = Intent(parent.context, ArticleActivity::class.java)
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_magi, parent, false)

        return MagiHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineList.size
    }

     private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
        return Random.nextInt(min,max)
    }


}


class MagiHolder (view: View) : RecyclerView.ViewHolder(view) {
}