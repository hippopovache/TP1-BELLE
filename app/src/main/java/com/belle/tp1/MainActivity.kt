package com.belle.tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var button: Button? = null;
    var editText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Cette activité est celle par défaut à trouver dans AndroidManifest.xml
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_second)
        button?.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EXTRA_TEXT, "Mon Texte")

            editText = findViewById(R.id.editText)
            intent.putExtra(SecondActivity.EXTRA_TEXT1, editText?.text.toString())

            startActivity(intent)

            //destroy de la première activity pour n'avoir plu que la second.
            finish()
        }

        Log.d("mainActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("mainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mainActivity", "onResume")
        //Mieux pour le projet41 de mettre les appels ajax ici
    }

    override fun onPause() {
        super.onPause()
        Log.d("mainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        //suppression des références (désalocation)
        button = null

        Log.d("mainActivity", "onDestroy")
    }
}
