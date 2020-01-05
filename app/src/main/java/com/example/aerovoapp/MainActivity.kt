package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aerovoapp.DisplayMenuActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }


    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply {
        }
        startActivity(intent)
    }


    fun gotoMain(view: View) {
        setContentView(R.layout.activity_main)
    }


    //TODO functies en schermen maken
    fun gotoMeldingen(view: View) {
        val intent = Intent(this,MeldingScherm::class.java).apply {  }
        startActivity(intent)
    }

    fun gotoInstellingen(view: View) {
        Toast.makeText(applicationContext, "Ga naar instellingen", Toast.LENGTH_LONG).show()

    }

    fun gotoGrafieken(view: View) {
        Toast.makeText(applicationContext, "Ga naar grafieken", Toast.LENGTH_LONG).show()

    }


}