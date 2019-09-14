package com.kVectorFoundation.KV.ViewModel

import com.kVectorFoundation.KV.Model.MagiModel
import retrofit2.Call
import retrofit2.http.*

interface RetrofitInterface {
        @GET("api/magazine")
        fun allMag():Call<List<MagiModel>>
        @GET("api/magazine/{id}")
        fun singleMag(@Path("id") id:Int):Call<List<MagiModel>>
        @POST("api/magazine/create")
        fun addMa():Call<List<MagiModel>>
        @PUT("api/magazine/update/{id}")
        fun editMag(@Path("id") id:Int):Call<List<MagiModel>>
        @DELETE("api/magazine/delete/{id}")
        fun deleteMag(@Path("id") id:Int):Call<List<MagiModel>>

}