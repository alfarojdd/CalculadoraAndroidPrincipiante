package com.example.iniciokotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button

    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var etResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.button_add)
        btnSub = findViewById(R.id.button_sub)
        btnMul = findViewById(R.id.button_mul)
        btnDiv = findViewById(R.id.button_div)

        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        etResult = findViewById(R.id.resultTV)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.button_add -> {
                result = a + b
            }
            R.id.button_sub -> {
                result = a - b
            }
            R.id.button_mul -> {
                result = a * b
            }
            R.id.button_div -> {
                result = a / b
            }
        }
        etResult.text = "Result is $result"
    }
}