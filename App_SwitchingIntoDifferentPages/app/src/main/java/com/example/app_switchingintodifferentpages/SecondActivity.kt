package com.example.app_switchingintodifferentpages

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the selected bouquet image resource ID from the intent
        val selectedBouquetImageResId = intent.getIntExtra("SELECTED_BOUQUET_IMAGE", 0)

        // Display the selected bouquet image in the ImageView
        val bouquetImageView = findViewById<ImageView>(R.id.iv_selected_bouquet)
        bouquetImageView.setImageResource(selectedBouquetImageResId)

        // Get the order details (delivery type) from the intent
        val orderDeliveryType = intent.getStringExtra("ORDER_DELIVERY_TYPE") ?: "No delivery type selected"

        // Find the TextView for the delivery type and set the delivery type text
        val orderDetailsTextView = findViewById<TextView>(R.id.tv_order_delivery_type)
        orderDetailsTextView.text = "Delivery Type: $orderDeliveryType"

        // Return to home page
        val returnButton = findViewById<Button>(R.id.btn_return_home)
        returnButton.setOnClickListener {
            // Go back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
