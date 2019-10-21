package com.gonz.mx.dagger.rx.testing.app

import android.app.Application
import android.util.Log
import com.gonz.mx.dagger.rx.testing.di.DaggerIntegralAppComponent
import com.gonz.mx.dagger.rx.testing.di.IntegralAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class IntegralApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatch: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerIntegralAppComponent
            .builder()
            .application(this)
            .build()
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatch
}