package com.example.aerovoapp

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_app_instellingen.*



class AppInstellingen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_instellingen)
        consent_switch.isChecked = getResources().getBoolean(R.bool.consent) //Set consent toggle to stored value
    }

    fun showMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply{}
        startActivity(intent)
    }

    fun gotoMeldingen(view: View) {
        val intent = Intent(this,MeldingScherm::class.java).apply {  }
        startActivity(intent)
    }

    fun gotoInstellingen(view: View) {
        setContentView(R.layout.activity_app_instellingen)
    }

    fun gotoGrafieken(view: View) {
        Toast.makeText(applicationContext, "Ga naar grafieken", Toast.LENGTH_LONG).show()
    }

    fun gotoNotificatieInstellingen(view: View){
        //TODO notificatie instellingen scherm maken mockup 22
        Toast.makeText(applicationContext, "Ga naar notificatie instellingen", Toast.LENGTH_LONG).show()
    }

    fun changeConsent(view: View){
        consent_switch.isChecked != consent_switch.isChecked
        //TODO find a way to store settings which can change. Res files are not changeable.
        //TODO update consent to server
    }



}
