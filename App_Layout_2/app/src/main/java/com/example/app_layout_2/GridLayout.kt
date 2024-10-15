package com.example.app_layout_2

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class GridLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Ensure this is compatible with your Android version and theme
        setContentView(R.layout.activity_grid_layout)

        val a = findViewById<ImageButton>(R.id.imageButton6)
        val b = findViewById<ImageButton>(R.id.imageButton7)
        val c = findViewById<ImageButton>(R.id.imageButton8)

        a.setOnClickListener {
            Toast.makeText(this, "Image Button 6 clicked", Toast.LENGTH_SHORT).show()
        }

        b.setOnClickListener {
            Toast.makeText(this, "Image Button 7 clicked", Toast.LENGTH_SHORT).show()
        }

        c.setOnClickListener {
            Toast.makeText(this, "Image Button 8 clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
