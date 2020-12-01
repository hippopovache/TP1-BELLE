package com.belle.tp1

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

class SecondActivity : AppCompatActivity() {

    var textView: TextView? = null
    var textView2: TextView? = null

    companion object{
        //les const vont dans companion object

        const val EXTRA_TEXT = "EXTRA_TEXT"
        const val EXTRA_TEXT1 = "EXTRA_TEXT1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        val extratext = intent.getStringExtra(EXTRA_TEXT)
        val extratext1 = intent.getStringExtra(EXTRA_TEXT1)

        textView?.text = extratext

        textView2?.text = intent.getStringExtra(EXTRA_TEXT1)



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