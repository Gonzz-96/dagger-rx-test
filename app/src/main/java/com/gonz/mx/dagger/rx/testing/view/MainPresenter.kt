package com.gonz.mx.dagger.rx.testing.view

import com.gonz.mx.dagger.rx.testing.SwapiService
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

class MainPresenter(private val view: MainContract.View,
                    private val swapiService: SwapiService) : MainContract.Presenter {

    override fun searchPeople(id: String) {
        val x = swapiService.getPeople(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                view.showToast(it.toString())
            }
    }
}