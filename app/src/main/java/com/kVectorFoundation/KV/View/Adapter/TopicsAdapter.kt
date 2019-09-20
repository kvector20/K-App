package com.kVectorFoundation.KV.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.kVectorFoundation.KV.Model.TopicModel
import com.kVectorFoundation.KV.R
import kotlin.random.Random

class TopicsAdapter (var magazineModel:List<TopicModel>): RecyclerView.Adapter<MagiTopicHolder>(){
    override fun onBindViewHolder(monthHolder: MagiTopicHolder, position: Int) {
        monthHolder.onBind(magazineModel[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagiTopicHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.mag_topics_row, parent, false)
        view.setOnClickListener {
           findNavController(view).navigate(R.id.magTitleFragment, null)

        }
        return MagiTopicHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineModel.size
    }


}

class MagiTopicHolder (var view: View) : RecyclerView.ViewHolder(view) {
    fun onBind(MagModel: TopicModel){
        val articalTV=itemView.findViewById<TextView>(R.id.TopicName)
        val articalImage=itemView.findViewById<ImageView>(R.id.TopicImage)
        // itemView.layoutParams.height= getRandomIntInRange()
        Glide.with(view)
            .load(MagModel.image)
            .apply(RequestOptions().override(getRandomIntInRange()))
            .into(articalImage)
        //Picasso.get().load(MagModel.image).into(articalImage)

    }
}


private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
    return Random.nextInt(min,max)
}
