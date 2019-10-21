package com.gonz.mx.dagger.rx.testing.di

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    fun getInjectedString() : String = "This string was injected!"
}