package com.example.app_switchingintodifferentpages

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup1 = findViewById<RadioGroup>(R.id.frg1)
        val radioGroup2 = findViewById<RadioGroup>(R.id.frg2)
        val radioGroup3 = findViewById<RadioGroup>(R.id.frg3)  // RadioGroup for Delivery options
        val checkBox1 = findViewById<CheckBox>(R.id.fcb1)      // Agree to continue checkbox
        val button1 = findViewById<Button>(R.id.fbtn1)

        var selectedBouquetImageResId = 0

        // Listen for bouquet selections in RadioGroup1
        radioGroup1.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.frbtn1 -> selectedBouquetImageResId = R.drawable.jasmine
                R.id.frbtn2 -> selectedBouquetImageResId = R.drawable.lotus
            }
        }

        // Listen for bouquet selections in RadioGroup2
        radioGroup2.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.frbtn3 -> selectedBouquetImageResId = R.drawable.rose
                R.id.frbtn4 -> selectedBouquetImageResId = R.drawable.sunflower
            }
        }

        // Handle "Order Placed" button click
        button1.setOnClickListener {
            // Get the selected delivery option (RadioButton ID)
            val selectedDeliveryOptionId = radioGroup3.checkedRadioButtonId

            // Check if a delivery option is selected
            if (selectedDeliveryOptionId == -1) {
                // No delivery option selected
                Toast.makeText(this, "Please select a delivery option", Toast.LENGTH_SHORT).show()
            } else if (!checkBox1.isChecked) {
                // Checkbox is not checked
                Toast.makeText(this, "Please agree to continue", Toast.LENGTH_SHORT).show()
            } else {
                // Both the delivery option is selected and checkbox is checked
                if (selectedBouquetImageResId != 0) {
                    // Get the delivery type text from the selected RadioButton
                    val selectedDeliveryRadioButton = findViewById<RadioButton>(selectedDeliveryOptionId)
                    val deliveryType = selectedDeliveryRadioButton.text.toString()

                    // Create an intent to pass data to SecondActivity
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("SELECTED_BOUQUET_IMAGE", selectedBouquetImageResId)
                    intent.putExtra("ORDER_DELIVERY_TYPE", deliveryType)  // Pass the delivery type
                    startActivity(intent)
                } else {
                    // No bouquet has been selected
                    Toast.makeText(this, "Please select a bouquet", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
