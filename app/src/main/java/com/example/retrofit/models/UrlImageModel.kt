package com.example.retrofit.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UrlImageModel {
    @SerializedName("file")
    @Expose
    var file: String? = null
}