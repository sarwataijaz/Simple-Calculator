package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val input = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ansBox: TextView = findViewById(R.id.ansBox)

        val cButton: Button = findViewById(R.id.cButton)
        val percentButton: Button = findViewById(R.id.percentButton)
        val crossButton: Button = findViewById(R.id.crossButton)
        val divideButton: Button = findViewById(R.id.divideButton)

        val num7: Button = findViewById(R.id.num7)
        val num8: Button = findViewById(R.id.num8)
        val num9: Button = findViewById(R.id.num9)
        val num6: Button = findViewById(R.id.num6)
        val num5: Button = findViewById(R.id.num5)
        val num4: Button = findViewById(R.id.num4)
        val num3: Button = findViewById(R.id.num3)
        val num2: Button = findViewById(R.id.num2)
        val num1: Button = findViewById(R.id.num1)

        val multiply: Button = findViewById(R.id.multiply)
        val minus: Button = findViewById(R.id.minus)
        val plus: Button = findViewById(R.id.plus)
        val ans: Button = findViewById(R.id.ans)

        cButton.setOnClickListener {
            ansBox.setText("")
        }
        num7.setOnClickListener {
            ansBox.append("7")
            input.append("7")
        }
        num8.setOnClickListener {
            ansBox.append("8")
            input.append("8")
        }
        num9.setOnClickListener {
            ansBox.append("9")
            input.append("9")
        }

        num6.setOnClickListener {
            ansBox.append("6")
            input.append("6")
        }
        num5.setOnClickListener {
            ansBox.append("5")
            input.append("6")
        }
        num4.setOnClickListener {
            ansBox.append("4")
            input.append("4")
        }

        num3.setOnClickListener {
            ansBox.append("3")
            input.append("3")
        }
        num2.setOnClickListener {
            ansBox.append("2")
            input.append("2")
        }
        num1.setOnClickListener {
            ansBox.append("1")
            input.append("1")
        }

        multiply.setOnClickListener {
            ansBox.append("x")
            input.append("x")
        }

        minus.setOnClickListener {
            ansBox.append("-")
            input.append("-")
        }
        plus.setOnClickListener {
            ansBox.append("+")
            input.append("+")
        }
        divideButton.setOnClickListener {
            ansBox.append("/")
            input.append("/")
        }
        percentButton.setOnClickListener {
            ansBox.append("%")
            input.append("%")
        }
        crossButton.setOnClickListener {
            val currentText = ansBox.text.toString()

// Check if the text is not empty before removing the last character
            if (currentText.isNotEmpty()) {
                // Remove the last character
                val newText = currentText.substring(0, currentText.length - 1)

                // Set the modified text back to the TextView
                ansBox.text = newText
            }
        }

        ans.setOnClickListener {
            val result: Double? = calculateResult(ansBox)
                if(result!=null) {
                    ansBox.text = result.toString()
                }
        }
    }

    private fun calculateResult(ansBox: TextView): Double? {
        val text = ansBox.text.toString()
        var operator: Char
        var num1: Double = 0.0
        var num2: Double = 0.0
        for(i in text.indices) {
            if(text[i] == '+' || text[i] == '-' || text[i] == 'x' || text[i] == '/') {
                if(num1!=null) {
                    operator = when(text[i]){
                        '+' ->  '+'
                        '-' -> '-'
                        'x' -> 'x'
                        '/' -> '/'
                        else -> '0'
                    }
                }
                else {
                    return null
                }
            }
        }
        return null
    }
}