package com.kVectorFoundation.KV.ViewModel

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
//
//open class CallApi() {
////    fun fatchData():List<MagModel>{
////        call()
////
////        return this.MagModel!!
////    }
//
//    fun call():List<MagModel>{
//        var MagMod:List<MagModel>?=null
//        ApiUtil.getServiceClass().allMag().enqueue(object : Callback<List<MagModel>> {
//
//            override fun onResponse(
//                call: Call<List<MagModel>>,
//                response: Response<List<MagModel>>
//            ) {
//                if (response.isSuccessful) {
//                    MagMod = response.body()!!
//                    Log.d( "MagiActivity","Returned count " + MagMod!!.size)
//                }
//            }
//
//            override fun onFailure(call: Call<List<MagModel>>, t: Throwable) {
//                //showErrorMessage();
//                Log.d("MagiActivity", "error loading from API")
//            }
//
//        })
//        return MagMod!!
//    }
//
//}