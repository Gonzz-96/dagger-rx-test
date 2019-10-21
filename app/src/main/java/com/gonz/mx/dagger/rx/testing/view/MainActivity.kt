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

class MainActivity : AppCompatActivity(), HasAndroidInjector, MainContract.View {

    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        // Injecting dependencies
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.searchPeople("1")
    }


    override fun showToast(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}
