package com.kVectorFoundation.KV.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.kVectorFoundation.KV.Model.MagList


class MagazineViewModel(application: Application) : AndroidViewModel(application) {

    //hady : this is the right declaration
    var magList = MutableLiveData<MagList>()


    val mApiClient = ApiUtil

    fun getMagazineListFromServer() {
//        magList.postValue()
    }

    //No Error
    private fun getMagazineList() {

        magList.value = mApiClient.getServiceClass().allMag().value


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
