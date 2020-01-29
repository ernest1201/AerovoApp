package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.android.extension.responseJson
import kotlinx.android.synthetic.main.aerovo_mijn.*
import kotlinx.android.synthetic.main.aerovo_mijn_aerovo.view.*
import org.json.JSONException
import org.json.JSONObject


class mijnAerovo : AppCompatActivity() {

    //lateinit var newAerovo: ImageView

    private var preferenceHelper: PreferenceHelper? = null
    private var aantalAerovos = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.aerovo_mijn)
        //getAerovo()
        preferenceHelper = PreferenceHelper(this)
        changeText()
        setVisibility(aantalAerovos) //TODO get the number from storage
    }

    /*private fun getAerovo() {

        //showSimpleProgressDialog(this@LoginActivity, null, "Loading...", false)
        val getAerovo_url =
            resources.getString(R.string.api_base_url) + resources.getString(R.string.api_getaerovo)
        try {

            Fuel.post(
                getAerovo_url, listOf(
                    "secret" to preferenceHelper!!.getSecret()
                )
            ).responseJson { request, response, result ->
                Log.d("plzzzzz", result.get().content)
                saveInfo(result.get().content)
            }
        } catch (e: Exception) {

        } finally {

        }
    }

    fun saveInfo(response: String) {
        preferenceHelper!!.putIsLogin(true)
        try {
            val jsonObject = JSONObject(response)
            if (jsonObject.getString("status") == "true") {
                val dataArray = jsonObject.getJSONArray("data")
                for (i in 0 until dataArray.length()) {

                    val dataobj = dataArray.getJSONObject(i)
                    preferenceHelper!!.putName(dataobj.getString("gebruikersnaam"))
                    preferenceHelper!!.putSecret(dataobj.getString("secret"))
                    preferenceHelper!!.putEmail(dataobj.getString("email"))
                    //preferenceHelper!!.putHobby(dataobj.getString("hobby"))
                }
            } else {
                val dataArray = jsonObject.getJSONArray("data")
                for (i in 0 until dataArray.length()) {

                    val dataobj = dataArray.getJSONObject(i)
                    preferenceHelper!!.putMessage(dataobj.getString("message"))
                }

            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }
*/

    /*private fun getAerovo() {
        //TODO get number of aerovo's
        var aantalAerovos = 3
        var eerste = true
        while (aantalAerovos != 0) {
            newAerovo = ImageView(this)
            mijnAerovo_layout.addView(newAerovo)

            newAerovo.id = 9999 + aantalAerovos
            if (eerste) {
                newAerovo.x = findViewById<NestedScrollView>(R.id.aerovo_scrollView).height + 0f
                eerste = false
                newAerovo.setBackgroundColor(Color.MAGENTA)
            } else {
                newAerovo.x = findViewById<ImageView>(9999 + aantalAerovos + 1).height + 24f
                newAerovo.setBackgroundColor(Color.BLUE)
            }
            newAerovo.layoutParams.width = findViewById<NestedScrollView>(R.id.aerovo_scrollView).width
            newAerovo.layoutParams.height = 100
            //newAerovo.text = getString(R.string.aerovo_naam, aantalAerovos)


            aantalAerovos--
        }
    }*/

    private fun setVisibility(aantalAerovo: Int) {
        val message = "User has no Aerovo devices added"
        if(preferenceHelper!!.getMessage().equals(message)){
            aantalAerovos = 0
        }

        if (aantalAerovo != 0) {
            textView_geen_aerovos.visibility = View.GONE
        }

        if (aantalAerovo >= 1) {
            include_aerovo_1.visibility = View.VISIBLE
        } else {
            include_aerovo_1.visibility = View.GONE
        }
        if (aantalAerovo >= 2) {
            include_aerovo_2.visibility = View.VISIBLE
        } else {
            include_aerovo_2.visibility = View.GONE
        }
        if (aantalAerovo >= 3) {
            include_aerovo_3.visibility = View.VISIBLE
        } else {
            include_aerovo_1.visibility = View.GONE
        }
        if (aantalAerovo >= 4) {
            include_aerovo_4.visibility = View.VISIBLE
        } else {
            include_aerovo_4.visibility = View.GONE
        }
        if (aantalAerovo >= 5) {
            include_aerovo_5.visibility = View.VISIBLE
        } else {
            include_aerovo_5.visibility = View.GONE
        }
        if (aantalAerovo >= 6) {
            include_aerovo_6.visibility = View.VISIBLE
        } else {
            include_aerovo_6.visibility = View.GONE
        }
        if (aantalAerovo >= 7) {
            include_aerovo_7.visibility = View.VISIBLE
        } else {
            include_aerovo_7.visibility = View.GONE
        }
        if (aantalAerovo >= 8) {
            include_aerovo_8.visibility = View.VISIBLE
        } else {
            include_aerovo_8.visibility = View.GONE
        }
        if (aantalAerovo >= 9) {
            include_aerovo_9.visibility = View.VISIBLE
        } else {
            include_aerovo_9.visibility = View.GONE

        }

    }

    private fun changeText() {// TODO get data from server
        /* for(x in 1 until aantalAerovo step 1){
             var test =  include_aerovo_1
             test.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 1)
             include_aerovo_1.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.015")
             include_aerovo_1.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

         }*/

        var huidigeAerovo = include_aerovo_1

        //huidigeAerovo.aerovo_naam_textview.text = preferenceHelper!!.getMessage()
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 1)
        //huidigeAerovo.aerovo_naam_textview.text = preferenceHelper!!.getSecret()
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.011")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_2
        //huidigeAerovo.aerovo_naam_textview.text = preferenceHelper!!.getSecret()
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 2)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.012")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")


        huidigeAerovo = include_aerovo_3
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 3)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.013")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_4
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 4)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.014")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_5
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 5)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.015")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_6
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 6)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.016")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_7
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 7)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.017")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_8
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 8)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.018")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")

        huidigeAerovo = include_aerovo_9
        huidigeAerovo.aerovo_naam_textview.text = getString(R.string.aerovo_naam, 9)
        huidigeAerovo.custom_locatie.text = getString(R.string.aerovo_locatie, "HHS D1.019")
        huidigeAerovo.postcode.text = getString(R.string.aerovo_postcode, "2624ZC")
    }

    fun aerovoToevoegen(view: View) {
        val intent = Intent(this,AddDevices::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

//TODO variabel aantal aerovo's en tekst van server


    fun showMenu(view: View) {
        val intent = Intent(this,DisplayMenuActivity::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }


}