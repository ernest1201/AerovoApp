package com.example.aerovoapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_app_instellingen.*
import kotlinx.android.synthetic.main.aerovo_mijn_aerovo.view.*
import kotlinx.android.synthetic.main.top_bar.*
import kotlinx.android.synthetic.main.top_bar.view.*


class AppInstellingen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_instellingen)
        consent_switch.isChecked = getResources().getBoolean(R.bool.consent) //Set consent toggle to stored value
        changeTopBar()
    }

    fun changeTopBar(){
        include_topBar_appInstellingen.Aerovo_top_tekst.text = getString(R.string.instellingen)
        include_topBar_appInstellingen.Aerovo_top_tekst.textSize = 50F
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
     val intent = Intent(this,NotificatieInstellingen::class.java).apply {  }
        startActivity(intent)
    }

    fun changeConsent(view: View){
        consent_switch.isChecked != consent_switch.isChecked
        //TODO find a way to store settings which can change. Res files are not changeable.
        //TODO update consent to server
    }

    fun popUp(view: View){
        include_delete_check.visibility = View.VISIBLE
        include_topBar_appInstellingen.alpha = 0.5F
        menu_button_Instellingen.alpha = 0.5F
        notificatieInstellingen_button.alpha = 0.5F
        consent_switch.alpha = 0.5F
        verwijder_account_button.alpha = 0.5F
        contact_header.alpha = 0.5F
        tel_en_mail.alpha = 0.5F
    }

    fun dontDelete(view: View){
        include_delete_check.visibility = View.INVISIBLE
        zetViewCorrect(view)
    }

    fun deleteAccount(view: View){
        //TODO fix yes loop altough not really necesarry when returning to loginscreen
        //TODO delete account and logout
        include_delete_check.visibility = View.INVISIBLE
        zetViewCorrect(view)
        Toast.makeText(applicationContext, "Account wordt verwijderd", Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)
    }

    private fun zetViewCorrect(view: View){
        include_topBar_appInstellingen.alpha = 1F
        menu_button_Instellingen.alpha = 1F
        notificatieInstellingen_button.alpha = 1F
        consent_switch.alpha = 1F
        verwijder_account_button.alpha = 1F
        contact_header.alpha = 1F
        tel_en_mail.alpha = 1F
    }

    /*class MyClass{
        companion object{
            var activity:Activity? = null
        }
    }*/

}
