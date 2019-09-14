package com.kVectorFoundation.KV.View.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kVectorFoundation.KV.View.adapter.MagiAdapter
import com.kVectorFoundation.KV.R
import com.kVectorFoundation.KV.Model.MagiModel
import com.kVectorFoundation.KV.ViewModel.ApiUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MagiActivity : AppCompatActivity() {
    var timeline: List<MagiModel>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magi)

        addtimline()
        var magazineView :RecyclerView = findViewById(R.id.recyclerView)
        magazineView.layoutManager = LinearLayoutManager(this@MagiActivity,LinearLayoutManager.VERTICAL,false)
        magazineView.adapter =
            timeline?.let { MagiAdapter(it, this@MagiActivity) }



        ApiUtil.getServiceClass().allMag().enqueue(object : Callback<List<MagiModel>> {

            override fun onResponse(
                call: Call<List<MagiModel>>,
                response: Response<List<MagiModel>>
            ) {
                if (response.isSuccessful) {
                    val postList = response.body()
                    Log.d( "MagiActivity","Returned count " + postList!!.size)
                }
            }

            override fun onFailure(call: Call<List<MagiModel>>, t: Throwable) {
                //showErrorMessage();
                Log.d("MagiActivity", "error loading from API")
            }

        })

    }

    fun addtimline(){

    }
}

