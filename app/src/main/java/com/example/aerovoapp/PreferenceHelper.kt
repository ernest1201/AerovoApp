package com.example.aerovoapp

import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(private val context: Context) {

    private val INTRO = "intro"
    private val NAME = "name"
    private  val EMAIL = "email"
    private val MESSAGE = "-2"

    private val secret = "-1"

    private val app_prefs: SharedPreferences

    init {
        app_prefs = context.getSharedPreferences(
            "shared",
            Context.MODE_PRIVATE
        )
    }

    fun putIsLogin(loginorout: Boolean) {
        val edit = app_prefs.edit()
        edit.putBoolean(INTRO, loginorout)
        edit.commit()
    }

    fun getIsLogin(): Boolean {
        return app_prefs.getBoolean(INTRO, false)
    }

    fun putName(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(NAME, loginorout)
        edit.commit()
    }

    fun putSecret(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(secret, loginorout)
        edit.commit()
    }

    fun getSecret(): String? {
        return app_prefs.getString(secret, "")
    }

    fun putEmail(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(EMAIL, loginorout)
        edit.commit()
    }

    fun getEmail(): String?{
        return app_prefs.getString(EMAIL,"")
    }

    fun putMessage(loginorout: String) {
        val edit = app_prefs.edit()
        edit.putString(MESSAGE, loginorout)
        edit.commit()
    }

    fun getMessage(): String?{
        return app_prefs.getString(MESSAGE,"")
    }

}