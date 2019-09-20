package com.kVectorFoundation.KV.Model

import com.squareup.moshi.Json

object  Model{

    class MagModel {

        @field:Json(name = "id")
        var id: Int? = null
        @field:Json(name = "title")
        var title: String? = null
        @field:Json(name = "body")
        var body: String? = null
        @field:Json(name = "author")
        var author: String? = null
        @field:Json(name = "views")
        var views: Int? = null
        @field:Json(name = "published")
        var published: Int? = null
        @field:Json(name = "collection_name")
        var collectionName: String? = null
        @field:Json(name = "collection_month")
        var collectionMonth: String? = null
        @field:Json(name = "created_at")
        var createdAt: String? = null
        @field:Json(name = "updated_at")
        var updatedAt: String? = null

    }

}
