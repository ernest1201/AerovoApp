package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply {
        }
        startActivity(intent)
    }


//    Obsolete
//    fun gotoMain(view: View) {
//        setContentView(R.layout.activity_main)
//    }

    fun gotoMeldingen(view: View) {
        val intent = Intent(this,MeldingScherm::class.java).apply {  }
        startActivity(intent)
    }

    fun gotoInstellingen(view: View) {
        val intent = Intent(this, AppInstellingen::class.java).apply {  }
        startActivity(intent)
    }


    //TODO grafieken pagina maken en nav functie toevoegen aan elke pagina
    fun gotoGrafieken(view: View) {
        val intent = Intent(this, Grafieken::class.java).apply { }
        startActivity(intent)
    }

    //TODO notificaties sturen


}