package com.belle.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var button: Button? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_second)

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
        Log.d("mainActivity", "onDestroy")
    }
}
