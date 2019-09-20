package com.kVectorFoundation.KV.Model

import androidx.lifecycle.MutableLiveData
import com.squareup.moshi.Json

class MagList{
    @field:Json(name = "data")
    var data: MutableLiveData<Model.MagModel>?=null

}
