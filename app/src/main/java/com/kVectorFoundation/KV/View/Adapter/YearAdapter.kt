package com.kVectorFoundation.KV.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.Model.YearMag
import com.kVectorFoundation.KV.R

class YearAdapter (var magazineModel:List<YearMag>): RecyclerView.Adapter<MagiYearHolder>(){

    override fun onBindViewHolder(monthHolder: MagiYearHolder, position: Int) {
        monthHolder.onBind(magazineModel[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagiYearHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.magi_time_row, parent, false)
        view.setOnClickListener{
            findNavController(view).navigate(R.id.magMonthFragment, null)
        }

        return MagiYearHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineModel.size
    }

//     private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
//        return Random.nextInt(min,max)
//    }


}


class MagiYearHolder (view: View) : RecyclerView.ViewHolder(view) {
    fun onBind(MagModel: YearMag){
        val yearTV=itemView.findViewById<TextView>(R.id.timeTV)
        yearTV.text=MagModel.Year

    }
}