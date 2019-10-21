package com.gonz.mx.dagger.rx.testing.di

import com.gonz.mx.dagger.rx.testing.SwapiService
import com.gonz.mx.dagger.rx.testing.view.MainActivity
import com.gonz.mx.dagger.rx.testing.view.MainContract
import com.gonz.mx.dagger.rx.testing.view.MainPresenter
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class MainActivityModule {

    @Provides
    fun getView(activity: MainActivity) : MainContract.View = activity

    @Provides
    fun getPresenter(view: MainContract.View,
                     service: SwapiService) : MainContract.Presenter = MainPresenter(view, service)

    @Provides
    fun getService(retrofitObject: Retrofit) : SwapiService = retrofitObject.create(SwapiService::class.java)
}