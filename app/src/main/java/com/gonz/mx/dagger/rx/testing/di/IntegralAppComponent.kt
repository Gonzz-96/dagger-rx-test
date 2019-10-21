package com.gonz.mx.dagger.rx.testing.di

import android.app.Application
import com.gonz.mx.dagger.rx.testing.app.IntegralApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBinder::class
])
interface IntegralAppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application) : Builder
        fun build(): IntegralAppComponent
    }

    fun inject(app: IntegralApp)
}