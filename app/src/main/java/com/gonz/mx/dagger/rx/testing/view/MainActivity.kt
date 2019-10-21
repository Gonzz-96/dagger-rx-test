package com.gonz.mx.dagger.rx.testing.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.gonz.mx.dagger.rx.testing.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
    @Inject lateinit var injectedString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, injectedString, Toast.LENGTH_SHORT).show()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}
