package com.kVectorFoundation.KV.ViewModel


object ApiUtil{

    val baseUrl="http://127.0.0.1:8000/"
    fun getServiceClass():RetrofitInterface{

        return RetrofitAPI.getRetrofit(baseUrl).create(RetrofitInterface::class.java)

    }
}