package com.example.aerovoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_melding_scherm.*
import kotlinx.android.synthetic.main.top_bar.view.*

class MeldingScherm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melding_scherm)
        changeTextTopBar()
        meldingWeergave(0) //TODO get number of notifications from server
    }

    private fun changeTextTopBar() {
        include_top_meldingen.Aerovo_top_tekst.text = getString(R.string.Meldingen)
        include_top_meldingen.Aerovo_top_tekst.textSize = 56F
    }

    private fun meldingWeergave(aantalMeldingen: Int) {
        //TODO update text voor de meldingen
        if (aantalMeldingen == 0 || !(aantalMeldingen > 0)) {
            melding5.visibility = View.GONE
            melding4.visibility = View.GONE
            melding3.visibility = View.GONE
            melding2.visibility = View.GONE
            melding1.text = getString(R.string.geen_meldingen)
            melding1.textSize = 24F
        } else
            if (aantalMeldingen == 1) {
                melding5.visibility = View.GONE
                melding4.visibility = View.GONE
                melding3.visibility = View.GONE
                melding2.visibility = View.GONE
                melding1.text = getString(R.string.melding_placeholder, 1)
            } else
                if (aantalMeldingen == 2) {
                    melding5.visibility = View.GONE
                    melding4.visibility = View.GONE
                    melding3.visibility = View.GONE
                    melding1.text = getString(R.string.melding_placeholder, 1)
                    melding2.text = getString(R.string.melding_placeholder, 2)

                } else
                    if (aantalMeldingen == 3) {
                        melding5.visibility = View.GONE
                        melding4.visibility = View.GONE
                        melding1.text = getString(R.string.melding_placeholder, 1)
                        melding2.text = getString(R.string.melding_placeholder, 2)
                        melding3.text = getString(R.string.melding_placeholder, 3)
                    } else
                        if (aantalMeldingen == 4) {
                            melding5.visibility = View.GONE
                            melding1.text = getString(R.string.melding_placeholder, 1)
                            melding2.text = getString(R.string.melding_placeholder, 2)
                            melding3.text = getString(R.string.melding_placeholder, 3)
                            melding4.text = getString(R.string.melding_placeholder, 4)

                        } else {
                            melding1.text = getString(R.string.melding_placeholder, 1)
                            melding2.text = getString(R.string.melding_placeholder, 2)
                            melding3.text = getString(R.string.melding_placeholder, 3)
                            melding4.text = getString(R.string.melding_placeholder, 4)
                            melding5.text = getString(R.string.melding_placeholder, 5)
                        }
    }

    private fun getMeldingText(meldingNummer: Int) {
        //TODO get text for melding
        if (meldingNummer == 1) {
            //melding1.text =
        }
        if (meldingNummer == 2) {
            //melding2.text 3
        }
        if (meldingNummer == 3) {
            //melding3.text =
        }
        if (meldingNummer == 4) {
            //melding4.text =
        }
        if (meldingNummer == 5) {
            //melding5.text =
        }
    }

    fun showMenu(view: View) {
        val intent = Intent(this,DisplayMenuActivity::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }




}
