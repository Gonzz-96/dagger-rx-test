package com.gonz.mx.dagger.rx.testing.di

import com.gonz.mx.dagger.rx.testing.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBinder {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity
}