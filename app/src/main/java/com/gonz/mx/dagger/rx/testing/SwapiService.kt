package com.gonz.mx.dagger.rx.testing

import com.gonz.mx.dagger.rx.testing.model.People
import io.reactivex.Observable
import retrofit2.http.Path
import retrofit2.http.GET

interface SwapiService  {
    @GET("people/{id}")
    fun getPeople(@Path("id") id: String) : Observable<People>
}