package com.kVectorFoundation.KV.View.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.kVectorFoundation.KV.Model.Model
import com.kVectorFoundation.KV.Model.YearMag
import com.kVectorFoundation.KV.View.Adapter.MonthAdapter
import kotlinx.android.synthetic.main.fragment_mag_month.*


class MagMonthFragment : Fragment() {

    var MagMode= listOf(
        YearMag("January "),
        YearMag("fab"),
        YearMag("march"),
        YearMag("april"),
        YearMag("may"),
        YearMag("june"),
        YearMag("july"),
        YearMag("august"),
        YearMag("sapt"),
        YearMag("oct"),
        YearMag("Nov"),
        YearMag("Dec")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.kVectorFoundation.KV.R.layout.fragment_mag_month, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        MonthRecyclerView.apply {
            layoutManager=LinearLayoutManager(activity)
            adapter= MonthAdapter(MagMode)

        }

    }
    fun sort(magModel:List<Model.MagModel>){
        for (i in 0..magModel.size){
            MagMode[i].Year= magModel[i].collectionMonth.toString()
        }
    }



}
