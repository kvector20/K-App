package com.kVectorFoundation.KV.Model

import androidx.lifecycle.MutableLiveData
import com.squareup.moshi.Json

data class MagList(
    @field:Json(name = "data")
    var data: List<MagList>
)