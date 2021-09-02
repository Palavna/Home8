package com.example.home8

import android.app.Application

class Home8 : Application() {
    override fun onCreate() {
        super.onCreate()
        PreferenceHelper.initPreference(this)
    }

}