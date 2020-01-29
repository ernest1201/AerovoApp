package com.example.aerovoapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.android.extension.responseJson
import kotlinx.android.synthetic.main.activity_app_instellingen.*
import kotlinx.android.synthetic.main.top_bar.view.*
import org.json.JSONException
import java.io.IOException


class AppInstellingen : AppCompatActivity() {

    internal var delete_User_Url = "https://aerovo.ddns.net/deleteuser.php"
    private var btnlogout: Button? = null
    private var preferenceHelper: PreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_instellingen)
        consent_switch.isChecked =
            getResources().getBoolean(R.bool.consent) //Set consent toggle to stored value
        changeTopBar()

        preferenceHelper = PreferenceHelper(this)

        btnlogout = findViewById<View>(R.id.uitlog_button) as Button

        btnlogout!!.setOnClickListener {
            preferenceHelper!!.putIsLogin(false)
            val intent = Intent(this@AppInstellingen, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this@AppInstellingen.finish()
        }

    }

    fun changeTopBar() {
        include_topBar_appInstellingen.Aerovo_top_tekst.text = getString(R.string.instellingen)
        include_topBar_appInstellingen.Aerovo_top_tekst.textSize = 45F
    }

    fun showMenu(view: View) {
        val intent = Intent(this,DisplayMenuActivity::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    fun gotoNotificatieInstellingen(view: View) {
        val intent = Intent(this, NotificatieInstellingen::class.java).apply { }
        startActivity(intent)
    }

    fun changeConsent(view: View) {
        consent_switch.isChecked != consent_switch.isChecked
        //TODO find a way to store settings which can change. Res files are not changeable.
        //TODO update consent to server
    }

    fun popUp(view: View) {
        include_delete_check.visibility = View.VISIBLE
        include_topBar_appInstellingen.alpha = 0.5F
        menu_button_Instellingen.alpha = 0.5F
        notificatieInstellingen_button.alpha = 0.5F
        consent_switch.alpha = 0.5F
        verwijder_account_button.alpha = 0.5F
        contact_header.alpha = 0.5F
        tel_en_mail.alpha = 0.5F
    }

    fun dontDelete(view: View) {
        include_delete_check.visibility = View.INVISIBLE
        zetViewCorrect(view)
    }

    fun deleteAccount(view: View) {
        //TODO fix yes loop altough not really necesarry when returning to loginscreen
        //TODO delete account and logout
        Toast.makeText(applicationContext, "Account wordt verwijderd", Toast.LENGTH_LONG).show()

        try {
            deleteUser()
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        preferenceHelper!!.putIsLogin(false)
        val intent = Intent(this,MainActivity::class.java).apply {  }
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)

        /*include_delete_check.visibility = View.INVISIBLE
        zetViewCorrect(view)
        Toast.makeText(applicationContext, "Account wordt verwijderd", Toast.LENGTH_LONG).show()
        setContentView(R.layout.activity_main)*/
    }

    @Throws(IOException::class, JSONException::class)
    private fun deleteUser(){
       /* try {
    //TODO verder met delete use
            Fuel.post(delete_User_Url, listOf(
                "email" to  etusername!!.text.toString()
                , "password" to  etpassword!!.text.toString()
            )).responseJson { request, response, result ->
                Log.d("plzzzzz", result.get().content)
                onTaskCompleted(result.get().content,LoginTask)
            }
        } catch (e: Exception) {

        } finally {

        }*/
    }

    private fun zetViewCorrect(view: View) {
        include_topBar_appInstellingen.alpha = 1F
        menu_button_Instellingen.alpha = 1F
        notificatieInstellingen_button.alpha = 1F
        consent_switch.alpha = 1F
        verwijder_account_button.alpha = 1F
        contact_header.alpha = 1F
        tel_en_mail.alpha = 1F
    }


}
