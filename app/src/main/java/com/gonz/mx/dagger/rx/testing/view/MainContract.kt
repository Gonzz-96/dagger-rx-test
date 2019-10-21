package com.gonz.mx.dagger.rx.testing.view

interface MainContract {
    interface View {
        fun showToast(s: String)
    }
    interface Presenter {
        fun searchPeople(id: String)
    }
}