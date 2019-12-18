package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

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

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }*/

    /*   override fun onOptionsItemSelected(item: MenuItem): Boolean {
           // Handle action bar item clicks here. The action bar will
           // automatically handle clicks on the Home/Up button, so long
           // as you specify a parent activity in AndroidManifest.xml.
           return when (item.itemId) {
               R.id.action_settings -> true
               else -> super.onOptionsItemSelected(item)
           }
       }*/
}
