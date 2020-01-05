package com.example.aerovoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.alpha
import kotlinx.android.synthetic.main.activity_melding_scherm.*
import kotlinx.android.synthetic.main.top_bar.view.*

class MeldingScherm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melding_scherm)
        changeTextTopBar()
        meldingWeergave(2) //TODO get number of notifications from server
    }

    private fun changeTextTopBar() {
        include_top_meldingen.Aerovo_top_tekst.text = getString(R.string.Meldingen)
        include_top_meldingen.Aerovo_top_tekst.textSize = 56F
    }

    private fun meldingWeergave(aantalMeldingen: Int) {
        //TODO get text for each melding
        if (aantalMeldingen <= 0){
            melding5.alpha = 0F
            melding4.alpha = 0F
            melding3.alpha = 0F
            melding2.alpha = 0F
            melding1.alpha = 0F
        }
        if (aantalMeldingen == 1){
            melding5.alpha = 0F
            melding4.alpha = 0F
            melding3.alpha = 0F
            melding2.alpha = 0F
        }
        if (aantalMeldingen == 2){
            melding5.alpha = 0F
            melding4.alpha = 0F
            melding3.alpha = 0F
        }
        if (aantalMeldingen == 3){
            melding5.alpha = 0F
            melding4.alpha = 0F
        }
        if (aantalMeldingen == 4){
            melding5.alpha = 0F
        }
    }

    private fun getMeldingText(meldingNummer: Int){
        //TODO get text for melding
    }

    fun gotoMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply {}
        startActivity(intent)
    }

    fun gotoMeldingen(view: View) {
        setContentView(R.layout.activity_melding_scherm)
    }

    fun gotoInstellingen(view: View) {

    }

    fun gotoGrafieken(view: View) {

    }


}
