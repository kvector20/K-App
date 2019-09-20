package com.kVectorFoundation.KV.ViewModel

import com.squareup.moshi.Moshi
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class RetrofitAPI {
    companion object{
        fun getRetrofit():RetrofitInterface{
            val baseUrl="http://127.0.0.1:8000/"

            val moshi = Moshi.Builder().build()
            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()

            return retrofit.create(RetrofitInterface::class.java)

        }
    }
}

