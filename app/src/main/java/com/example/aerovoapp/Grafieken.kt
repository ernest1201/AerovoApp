package com.example.aerovoapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class Grafieken : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grafieken)
        vulGrafiek()
    }

    //TODO tijdsperiode en aerovo veranderen
    fun vulGrafiek() {
        val Grafiek = findViewById(R.id.Grafiek) as GraphView
        val series = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.0), DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0), DataPoint(3.0, 2.0), DataPoint(4.0, 6.0)
            )
        )

        val series2 = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 3.0), DataPoint(1.0, 2.0),
                DataPoint(2.0, 5.0), DataPoint(3.0, 8.0), DataPoint(4.0, 2.0)
            )
        )

        series.setColor(Color.RED)
        Grafiek.addSeries(series)
        Grafiek.addSeries(series2)

    }

    fun showMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMijnAerovo(view: View) {
        val intent = Intent(this, mijnAerovo::class.java).apply { }
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
        setContentView(R.layout.activity_grafieken)
    }
}
