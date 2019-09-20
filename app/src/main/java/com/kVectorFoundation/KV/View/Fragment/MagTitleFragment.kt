package com.kVectorFoundation.KV.View.Fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kVectorFoundation.KV.Model.TopicModel
import com.kVectorFoundation.KV.Model.YearMag
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.View.Adapter.TitelAdapter
import com.kVectorFoundation.KV.View.Adapter.YearAdapter
import kotlinx.android.synthetic.main.fragment_mag_title.*
import kotlinx.android.synthetic.main.fragment_mag_year.*

/**
 * A simple [Fragment] subclass.
 */
class MagTitleFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_mag_title, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        TitleRecyclerView.apply {
            layoutManager= LinearLayoutManager(activity)
            adapter= TitelAdapter(MagMode)
        }
    }


}
