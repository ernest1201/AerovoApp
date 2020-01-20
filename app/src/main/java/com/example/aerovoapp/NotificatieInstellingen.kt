package com.example.aerovoapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_app_instellingen.*
import kotlinx.android.synthetic.main.activity_notificatie_instellingen.*
import kotlinx.android.synthetic.main.top_bar.view.*


class NotificatieInstellingen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificatie_instellingen)
/*
        AppInstellingen.MyClass.activity?.finish()
*/
        changeTopBar()
    }

    fun changeTopBar() {
        include_topBar_notificatieInstellingen.Aerovo_top_tekst.text =
            getString(R.string.instellingen)
        include_topBar_notificatieInstellingen.Aerovo_top_tekst.textSize = 50F
    }

    fun showMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply {}
        startActivity(intent)
    }

    fun gotoMeldingen(view: View) {
        val intent = Intent(this, MeldingScherm::class.java).apply { }
        startActivity(intent)
    }

    fun gotoInstellingen(view: View) {
        val intent = Intent(this, AppInstellingen::class.java).apply { }
        startActivity(intent)
    }

    fun gotoGrafieken(view: View) {
        val intent = Intent(this, Grafieken::class.java).apply { }
        startActivity(intent)
    }


    fun clearDagen(view: View) {
        RadioButton_maandag.isChecked = false
        RadioButton_dinsdag.isChecked = false
        RadioButton_woensdag.isChecked = false
        RadioButton_donderdag.isChecked = false
        RadioButton_donderdag.isChecked = false
        RadioButton_vrijdag.isChecked = false
        RadioButton_vrijdag.isChecked = false
        RadioButton_zaterdag.isChecked = false
        RadioButton_zondag.isChecked = false
    }

    fun instellingenOpslaan(view: View) {
        //TODO sla alles op
    }


}
