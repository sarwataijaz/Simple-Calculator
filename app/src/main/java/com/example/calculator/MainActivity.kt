package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ansCalculated: Boolean = false

        val ansBox: TextView = findViewById(R.id.ansBox)

        val cButton: ImageView = findViewById(R.id.cButton)
        val percentButton: ImageView = findViewById(R.id.percentButton)
        val crossButton: ImageView = findViewById(R.id.crossButton)
        val divideButton: ImageView = findViewById(R.id.divideButton)
        val doubleZero: ImageView = findViewById(R.id.doubleZero)
        val zero: ImageView = findViewById(R.id.zero)

        val num7: ImageView = findViewById(R.id.num7)
        val num8: ImageView = findViewById(R.id.num8)
        val num9: ImageView = findViewById(R.id.num9)
        val num6: ImageView = findViewById(R.id.num6)
        val num5: ImageView = findViewById(R.id.num5)
        val num4: ImageView = findViewById(R.id.num4)
        val num3: ImageView = findViewById(R.id.num3)
        val num2: ImageView = findViewById(R.id.num2)
        val num1: ImageView = findViewById(R.id.num1)

        val multiply: ImageView = findViewById(R.id.multiply)
        val minus: ImageView = findViewById(R.id.minus)
        val plus: ImageView = findViewById(R.id.plus)
        val point: ImageView = findViewById(R.id.point)
        val ans: ImageView = findViewById(R.id.ans)



        cButton.setOnClickListener{
             val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            cButton.startAnimation(animation)
            ansBox.setText("")
        }
        num7.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num7.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "7"
                ansCalculated = false
            } else {
                ansBox.append("7")
            }
        }
        num8.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num8.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "8"
                ansCalculated = false
            } else {
                ansBox.append("8")
            }
        }
        num9.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num9.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "9"
                ansCalculated = false
            } else {
                ansBox.append("9")
            }
        }

        num6.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num6.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "6"
                ansCalculated = false
            } else {
                ansBox.append("6")
            }
        }
        num5.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num5.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "5"
                ansCalculated = false
            } else {
                ansBox.append("5")
            }
        }
        num4.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num4.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "4"
                ansCalculated = false
            } else {
                ansBox.append("4")
            }
        }

        num3.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num3.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "3"
                ansCalculated = false
            } else {
                ansBox.append("3")
            }
        }
        num2.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num2.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "2"
                ansCalculated = false
            } else {
                ansBox.append("2")
            }
        }
        num1.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            num1.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "1"
                ansCalculated = false
            } else {
                ansBox.append("1")
            }
        }

        multiply.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            multiply.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "x"
                ansCalculated = false
            } else {
                ansBox.append("x")
            }
        }

        minus.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            minus.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "-"
                ansCalculated = false
            } else {
                ansBox.append("-")
            }
        }
        plus.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            plus.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "+"
                ansCalculated = false
            } else {
                ansBox.append("+")
            }
        }
        divideButton.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            divideButton.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "/"
                ansCalculated = false
            } else {
                ansBox.append("/")
            }
        }
        percentButton.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            percentButton.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "%"
                ansCalculated = false
            } else {
                ansBox.append("%")
            }
        }

        point.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            point.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "."
                ansCalculated = false
            } else {
                ansBox.append(".")
            }
        }


        doubleZero.setOnClickListener{
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            doubleZero.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "00"
                ansCalculated = false
            } else {
                ansBox.append("00")
            }
        }

        zero.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            zero.startAnimation(animation)
            if(ansCalculated == true) {
                ansBox.text = "0"
                ansCalculated = false
            } else {
                ansBox.append("0")
            }
        }

        crossButton.setOnClickListener {
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            crossButton.startAnimation(animation)
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
            val animation: Animation = AnimationUtils.loadAnimation(this, R.anim.fadein)
            ans.startAnimation(animation)
            ansCalculated = true
            val result = calculateResult(ansBox)
                if(result!=null) {
                    ansBox.text = result.toString()
                } else {
                    ansBox.text = "Exception Error"
                }
        }
    }

    private fun calculateResult(ansBox: TextView): Any? {
        val text = ansBox.text.toString()
        val numbers = mutableListOf<Double>()
        val operators = mutableListOf<Char>()
        var currentNumber = StringBuilder()

        for (char in text) {
            if (char.isDigit()) {
                currentNumber.append(char)
            } else if (char in setOf<Char>('+', '-', 'x', '/', '%')) {
                if (currentNumber.isNotEmpty()) {
                    numbers.add(currentNumber.toString().toDouble())
                    currentNumber.clear()
                } else {
                    return null
                }
                operators.add(char)
            }
        }

        if (currentNumber.isNotEmpty()) {
            numbers.add(currentNumber.toString().toDouble())
        } else {
            return null
        }

        var result = numbers[0]
        for (i in 1 until numbers.size) {
            when (operators[i - 1]) {
                '+' -> result += numbers[i]
                '-' -> result -= numbers[i]
                'x' -> result *= numbers[i]
                '/' -> result /= numbers[i]
                '%' -> result * 100 / numbers[i]
            }
        }

        return if(result % 1.0 == 0.0) {
            result.toInt()
        } else {
            result
        }
    }
}
