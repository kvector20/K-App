package com.kVectorFoundation.KV.View.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kVectorFoundation.KV.Model.TopicModel
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.View.Adapter.TopicsAdapter
import kotlinx.android.synthetic.main.fragment_mag_topics.*

/**
 * A simple [Fragment] subclass.
 */
class MagTopicsFragment : Fragment() {
    var MagMode= listOf(
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo),
        TopicModel(R.drawable.logo)
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mag_topics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TopicsRecyclerView.apply {
            layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter= TopicsAdapter(MagMode)
        }

    }
//
//    fun sort(magModel:List<MagModel>){
//        for (i in 0..magModel.size){
//            if(magModel[i].collectionMonth)
//            MagMode[i].image= magModel[i].title
//        }
//    }


}
