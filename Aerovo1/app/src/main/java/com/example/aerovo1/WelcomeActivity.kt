package com.example.aerovo1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private var tvname: TextView? = null
    private var tvhobby:TextView? = null
    private var btnlogout: Button? = null
    private var btnAddDevices: Button? = null
    private var preferenceHelper: PreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        preferenceHelper = PreferenceHelper(this)


        tvname = findViewById<View>(R.id.tvname) as TextView
        btnlogout = findViewById<View>(R.id.btn) as Button
        btnAddDevices = findViewById<View>(R.id.btnAddDevices) as Button

        tvname!!.text = "Welkom " + preferenceHelper!!.getNames()


        btnlogout!!.setOnClickListener {
            preferenceHelper!!.putIsLogin(false)
            val intent = Intent(this@WelcomeActivity, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@WelcomeActivity.finish()
        }
        btnAddDevices!!.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, AddDevices::class.java)
            startActivity(intent)

        }
    }
}