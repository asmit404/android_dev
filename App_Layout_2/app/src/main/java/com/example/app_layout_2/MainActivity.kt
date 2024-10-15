package com.example.app_layout_2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<EditText>(R.id.editTextText)
        var a = findViewById<EditText>(R.id.editTextText)
        findViewById<EditText>(R.id.editTextText2)
        var b = findViewById<EditText>(R.id.editTextText2)
        findViewById<Button>(R.id.button)
        var c = findViewById<Button>(R.id.button)
        findViewById<TextView>(R.id.textView)
        var d = findViewById<TextView>(R.id.textView)

        c.setOnClickListener{
            var e = a.text.toString()
            var f = b.text.toString()
            d.text="Your Name is "+e+" And Your Phone Number is "+f
        }

        }
    }
