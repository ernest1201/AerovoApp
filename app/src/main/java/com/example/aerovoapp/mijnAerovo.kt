package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.aerovo_mijn.*
import kotlinx.android.synthetic.main.aerovo_mijn_aerovo.view.*


class mijnAerovo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aerovo_mijn)
        changeText()
    }

    private fun changeText() {// TODO get data from server
        include_aerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 1)
        include_aerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.015")
        include_aerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")
        include_aerovo2.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 2)
        include_aerovo2.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.013")
        include_aerovo2.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")
    }

    fun aerovoToevoegen(view: View) {
        Toast.makeText(applicationContext, "Toevoegen komt hier!", Toast.LENGTH_SHORT).show()
    }

    //TODO variabel aantal aerovo's en tekst van server


    fun showMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        setContentView(R.layout.aerovo_mijn)
    }

    fun gotoMeldingen(view: View) {
        val intent = Intent(this,MeldingScherm::class.java).apply {  }
        startActivity(intent)
    }

    fun gotoInstellingen(view: View) {
        val intent = Intent(this, AppInstellingen::class.java).apply {  }
        startActivity(intent)
    }

    fun gotoGrafieken(view: View) {
        Toast.makeText(applicationContext, "Ga naar grafieken", Toast.LENGTH_LONG).show()
    }



}