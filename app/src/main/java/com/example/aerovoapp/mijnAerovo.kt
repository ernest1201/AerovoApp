package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.aerovo_mijn.*
import kotlinx.android.synthetic.main.aerovo_mijn_aerovo.*
import kotlinx.android.synthetic.main.aerovo_mijn_aerovo.view.*


class mijnAerovo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aerovo_mijn)
        changeText()
    }

    private fun changeText() {
        include_aerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 1)
        include_aerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.015")
        include_aerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")
        include_aerovo2.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 2)
        include_aerovo2.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.013")
        include_aerovo2.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")
    }



    fun gotoMenu(view: View) {
        setContentView(R.layout.activity_display_menu)
    }

    fun gotoMain(view: View) {
        val intent = Intent(this, MainActivity::class.java).apply {
        }
        startActivity(intent)
    }

    fun gotoMijnAerovo(view: View) {
       setContentView(R.layout.aerovo_mijn)
    }

    fun aerovoToevoegen(view: View) {
        Toast.makeText(applicationContext, "Toevoegen komt hier!", Toast.LENGTH_SHORT).show()
    }


    /* view.findViewById<Button>(R.id.menu_button).setOnClickListener{
         val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
         myToast.show()
     }
     */

    /* override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         // Inflate the layout for this fragment
         return inflater.inflate(R.layout.aerovo_mijn, container, false)
     }*/


    /* companion object {
         */
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeScreen.
     *//*
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            mijnAerovo().apply {
            }
    }*/

}
