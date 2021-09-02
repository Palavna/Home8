package com.example.home8

import android.content.Context
import android.content.SharedPreferences

object PreferenceHelper {
    private lateinit var preference: SharedPreferences
    fun initPreference(context: Context) {
        preference = context.getSharedPreferences("home8", Context.MODE_PRIVATE)
    }

    fun saveedFirst(edFirst: String) {
        preference.edit().putString("edFirst", edFirst).apply()
    }

    fun getedFirst(): String? {
        return preference.getString("edFirst", "")
    }

    fun saveedLast(edLast: String) {
        preference.edit().putString("edLast", edLast).apply()
    }

    fun getedLast(): String? {
        return preference.getString("edLast", "")
    }

    fun savedefaul(defaul: String) {
        preference.edit().putString("defaul", defaul).apply()
    }

    fun getdefaul(): String? {
        return preference.getString("defaul", "")
    }

    fun saveedZip(edZip: String) {
        preference.edit().putString("edZip", edZip).apply()
    }

    fun getedZip(): String? {
        return preference.getString("edZip", "")
    }

    fun saveedCity(edCity: String) {
        preference.edit().putString("edCity", edCity).apply()
    }

    fun getedCity(): String? {
        return preference.getString("edCity", "")
    }

    fun saveedState(edState: String) {
        preference.edit().putString("edState", edState).apply()
    }

    fun getedState(): String? {
        return preference.getString("edState", "")
    }

    fun saveStroka1(Stroka1: String) {
        preference.edit().putString("Stroka1", Stroka1).apply()
    }

    fun getStroka1(): String? {
        return preference.getString("Stroka1", "")
    }

    fun saveStroka2(Stroka2: String) {
        preference.edit().putString("Stroka2", Stroka2).apply()
    }

    fun getStroka2(): String? {
        return preference.getString("Stroka2", "")
    }

    fun saveStroka3(Stroka3: String) {
        preference.edit().putString("Stroka3", Stroka3).apply()
    }

    fun getStroka3(): String? {
        return preference.getString("Stroka3", "")
    }
}



