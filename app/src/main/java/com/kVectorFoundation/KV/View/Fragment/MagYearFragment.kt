package com.kVectorFoundation.KV.View.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.kVectorFoundation.KV.Model.Model
import com.kVectorFoundation.KV.Model.YearMag
import com.kVectorFoundation.KV.View.Adapter.YearAdapter
import com.kVectorFoundation.KV.ViewModel.MagazineViewModel
import kotlinx.android.synthetic.main.fragment_mag_year.*

class MagYearFragment : Fragment() {
    var MagMode= mutableListOf(
        YearMag("2019"),
        YearMag("2018"),
        YearMag("2017"),
        YearMag("2016"),
        YearMag("2015"),
        YearMag("2014"),
        YearMag("2013"),
        YearMag("2012"),
        YearMag("2011")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(com.kVectorFoundation.KV.R.layout.fragment_mag_year, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel: MagazineViewModel by lazy {
            ViewModelProviders.of(this).get(MagazineViewModel::class.java)
        }
        viewModel.getMagazineListFromServer().observe(this, Observer {

            Year_RecyclerView.apply {
                layoutManager=LinearLayoutManager(activity)
//                adapter= YearAdapter(it!!)
            }
        })

    }



//
//    fun sort(magModel:List<Model.MagModel>){
//        for (i in 0..magModel.size){
//            MagMode[i].Year= magModel[i].createdAt.toString()
//        }
//    }

}
