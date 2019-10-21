package com.gonz.mx.dagger.rx.testing.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class People(
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("hair_color")
    @Expose
    val hairColor: String,
    @SerializedName("skin_color")
    @Expose
    val skinColor: String
)