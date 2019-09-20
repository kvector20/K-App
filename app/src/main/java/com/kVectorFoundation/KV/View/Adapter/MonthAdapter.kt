package com.kVectorFoundation.KV.View.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.Model.YearMag
import com.kVectorFoundation.KV.R

class MonthAdapter  (var magazineModel:List<YearMag>): RecyclerView.Adapter<MagiMonthHolder>(){
    override fun onBindViewHolder(monthHolder: MagiMonthHolder, position: Int) {
        monthHolder.onBind(magazineModel[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MagiMonthHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.magi_time_row, parent, false)

        view.setOnClickListener{
            findNavController(view).navigate(R.id.magTopicsFragment, null)

        }
        return MagiMonthHolder(view)
    }

    override fun getItemCount(): Int {
        return magazineModel.size
    }

//     private fun getRandomIntInRange(max: Int=350, min: Int=270): Int {
//        return Random.nextInt(min,max)
//    }


}


class MagiMonthHolder (view: View) : RecyclerView.ViewHolder(view) {
    fun onBind(MagModel: YearMag){
        val yearTV=itemView.findViewById<TextView>(R.id.timeTV)
        yearTV.text=MagModel.Year

    }
}