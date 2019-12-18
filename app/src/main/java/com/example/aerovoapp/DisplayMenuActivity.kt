package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_display_menu.*

class DisplayMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_menu)

        menu_instellingen_button.setOnClickListener(){
            val intent = Intent(this, mijnAerovo::class.java)
            startActivity(intent)

        }

    }

}
