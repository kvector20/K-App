package com.kVectorFoundation.KV.Model

import com.squareup.moshi.Json



//data class MagiModel(var id: Int, var likes: Int, var image: Int, var title: String)

class MagiModel{
    @field:Json(name = "data")
    var data: List<MagList>? = null
}

