package com.belle.tp1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        Log.d("secondActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("secondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("secondActivity", "onResume")
        //Mieux pour le projet41 de mettre les appels ajax ici
    }

    override fun onPause() {
        super.onPause()
        Log.d("secondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("secondActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("secondActivity", "onDestroy")
    }
}