package com.kVectorFoundation.KV.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.kVectorFoundation.KV.Model.MagList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MagazineViewModel(application: Application) : AndroidViewModel(application) {

    //hady : this is the right declaration
    var magListLiveData = MutableLiveData<MagList>()


    val mApiClient = ApiUtil

    fun getMagazineListFromServer() {
//        magList.postValue()
    }

    //No Error
    private fun getMagazineList() {

        mApiClient.getServiceClass().allMag().enqueue(object : Callback<MagList> {
            override fun onFailure(call: Call<MagList>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<MagList>, response: Response<MagList>) {
                if (response.isSuccessful) {
                    if (response.body() != null) {
                        magListLiveData.postValue(response.body())
                    }
                }
            }
        })


//        mApiClient.allMag().value
//            .observerOn(AndroidSchedulers.mainThread())
//            .subscribeOn(Schedulers.io())
//            .subscribe({ it:MagList ->
//                magList!!.postValue(it)
//            }, { it:List<Model.MagModel> ->
//                Log.d("error", "errors")
//            })
    }


}
