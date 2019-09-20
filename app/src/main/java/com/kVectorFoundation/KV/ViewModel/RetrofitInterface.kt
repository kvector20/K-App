package com.kVectorFoundation.KV.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.kVectorFoundation.KV.Model.MagList
import com.kVectorFoundation.KV.Model.Model.MagModel
import retrofit2.Call
import retrofit2.http.*
import java.util.*

interface RetrofitInterface {
    @GET("api/magazine")
    fun allMag(): Call<MagList>

    @GET("api/magazine/{id}")
    fun singleMag(@Path("id") id: Int): Call<MagModel>

    @POST("api/magazine/create")
    fun addMa(): Call<List<MagModel>>

    @PUT("api/magazine/update/{id}")
    fun editMag(@Path("id") id: Int): Call<MagModel>

    @DELETE("api/magazine/delete/{id}")
    fun deleteMag(@Path("id") id: Int): Call<MagModel>

}