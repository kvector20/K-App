package com.kVectorFoundation.KV.ViewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.kVectorFoundation.KV.Model.MagList
import com.kVectorFoundation.KV.Model.Model
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*

class MagazineViewModel (application: Application):AndroidViewModel(application){
    var magList:MutableLiveData<MagList>?=null
    val mApiClient by lazy {
        RetrofitAPI.getRetrofit()
    }
    fun getMagazineListFromServer():MutableLiveData<MagList>{
        if (magList==null){
            magList= MutableLiveData()
            //getMagazineList()
        }
        return magList as MutableLiveData<MagList>
    }
//   TODO error

    private fun getMagazineList() {

        magList?.value=mApiClient.allMag().value



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
