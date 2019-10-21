package com.gonz.mx.dagger.rx.testing.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class People(
    @SerializedName("name")
    @Expose
    val name: String
)