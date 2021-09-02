package com.example.home8

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edFirst = findViewById<EditText>(R.id.edFirst)
        val edLast = findViewById<EditText>(R.id.edLast)
        val defaul = findViewById<EditText>(R.id.defaul)
        val edZip = findViewById<EditText>(R.id.edZip)
        val edCity = findViewById<EditText>(R.id.edCity)
        val edState = findViewById<EditText>(R.id.edState)
        val stroka1 = findViewById<EditText>(R.id.stroka1)
        val stroka2 = findViewById<EditText>(R.id.stroka2)
        val stroka3 = findViewById<EditText>(R.id.stroka3)
        val btn = findViewById<Button>(R.id.btn)

        edFirst.setText(PreferenceHelper.getedFirst())
        edLast.setText(PreferenceHelper.getedLast())
        defaul.setText(PreferenceHelper.getdefaul())
        edZip.setText(PreferenceHelper.getedZip())
        edCity.setText(PreferenceHelper.getedCity())
        edState.setText(PreferenceHelper.getedState())
        stroka1.setText(PreferenceHelper.getStroka1())
        stroka2.setText(PreferenceHelper.getStroka2())
        stroka3.setText(PreferenceHelper.getStroka3())

        btn.setOnClickListener {
            PreferenceHelper.saveedFirst(edFirst.text.toString())
            PreferenceHelper.saveedLast(edLast.text.toString())
            PreferenceHelper.savedefaul(defaul.text.toString())
            PreferenceHelper.saveedZip(edZip.text.toString())
            PreferenceHelper.saveedCity(edCity.text.toString())
            PreferenceHelper.saveedState(edState.text.toString())
            PreferenceHelper.saveStroka1(stroka1.text.toString())
            PreferenceHelper.saveStroka2(stroka2.text.toString())
            PreferenceHelper.saveStroka3(stroka3.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}


