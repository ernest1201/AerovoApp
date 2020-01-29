package com.example.aerovoapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_grafieken.*

class Grafieken : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafieken)
        vulGrafiek()
        setVisibility(6) //TODO get the number from storage
    }

    // Geen tijdsperiode atm

    //TODO functie om van de geselecteerde aerovo de data te krijgen en weer te geven
    fun laadGrafiek(view: View) {

    }

    fun selectOne(view: View) {
        if (view.id == aerovo1.id) {
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo2.id) {
            aerovo1.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo3.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo4.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo5.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo6.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo7.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo8.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo8.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo9.isChecked = false
        } else if (view.id == aerovo9.id) {
            aerovo1.isChecked = false
            aerovo2.isChecked = false
            aerovo3.isChecked = false
            aerovo4.isChecked = false
            aerovo5.isChecked = false
            aerovo6.isChecked = false
            aerovo7.isChecked = false
            aerovo8.isChecked = false
        }

    }

    private fun setVisibility(aantalAerovo: Int) {
        if (aantalAerovo >= 1) {
            aerovo1.visibility = View.VISIBLE
        } else {
            aerovo1.visibility = View.GONE
        }
        if (aantalAerovo >= 2) {
            aerovo2.visibility = View.VISIBLE
        } else {
            aerovo2.visibility = View.GONE
        }
        if (aantalAerovo >= 3) {
            aerovo3.visibility = View.VISIBLE
        } else {
            aerovo3.visibility = View.GONE
        }
        if (aantalAerovo >= 4) {
            aerovo4.visibility = View.VISIBLE
        } else {
            aerovo4.visibility = View.GONE
        }
        if (aantalAerovo >= 5) {
            aerovo5.visibility = View.VISIBLE
        } else {
            aerovo5.visibility = View.GONE
        }
        if (aantalAerovo >= 6) {
            aerovo6.visibility = View.VISIBLE
        } else {
            aerovo6.visibility = View.GONE
        }
        if (aantalAerovo >= 7) {
            aerovo7.visibility = View.VISIBLE
        } else {
            aerovo7.visibility = View.GONE
        }
        if (aantalAerovo >= 8) {
            aerovo8.visibility = View.VISIBLE
        } else {
            aerovo8.visibility = View.GONE
        }
        if (aantalAerovo >= 9) {
            aerovo9.visibility = View.VISIBLE
        } else {
            aerovo9.visibility = View.GONE

        }

    }


    @SuppressLint("NewApi")
    fun vulGrafiek() {
        val Grafiek = findViewById(R.id.Grafiek) as GraphView
        val koolstof = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.0), DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0), DataPoint(3.0, 2.0), DataPoint(4.0, 6.0)
            )
        )

        val temperatuur = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 3.0), DataPoint(1.0, 2.0),
                DataPoint(2.0, 5.0), DataPoint(3.0, 8.0), DataPoint(4.0, 2.0)
            )
        )

        val fijnstof = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 5.2), DataPoint(1.0, 6.5),
                DataPoint(2.0, 4.7), DataPoint(3.0, 2.7), DataPoint(4.0, 2.7)
            )
        )

        val zuurstof = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 3.5), DataPoint(1.0, 3.6),
                DataPoint(2.0, 3.5), DataPoint(3.0, 3.0), DataPoint(4.0, 2.7)
            )
        )

        koolstof.color = getColor(R.color.co2_kleur)
        temperatuur.color = getColor(R.color.temp_kleur)
        fijnstof.color = getColor(R.color.fijnstof_kleur)
        zuurstof.color = getColor(R.color.fijnstof_kleur)

        Grafiek.addSeries(koolstof)
        Grafiek.addSeries(temperatuur)
        Grafiek.addSeries(fijnstof)
        Grafiek.addSeries(zuurstof)

    }

    fun showMenu(view: View) {
        val intent = Intent(this,DisplayMenuActivity::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }


}
