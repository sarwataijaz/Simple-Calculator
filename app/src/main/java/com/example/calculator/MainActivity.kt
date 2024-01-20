package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cButton: Button = findViewById(R.id.cButton)
        val percentButton: Button = findViewById(R.id.percentButton)
        val crossButton: Button = findViewById(R.id.crossButton)
        val divideButton: Button = findViewById(R.id.divideButton)
        val ansBox: TextView = findViewById(R.id.ansBox)
        val num7: Button = findViewById(R.id.num7)
        val num8: Button = findViewById(R.id.num8)
        val num9: Button = findViewById(R.id.num9)
        val multiply: Button = findViewById(R.id.multiply)

        cButton.setOnClickListener {
            ansBox.setText("")
        }
        num7.setOnClickListener {
            ansBox.append("7")
        }
        num8.setOnClickListener {
            ansBox.append("8")
        }
        num9.setOnClickListener {
            ansBox.append("9")
        }

        multiply.setOnClickListener {
            ansBox.append("*")
        }
    }


}