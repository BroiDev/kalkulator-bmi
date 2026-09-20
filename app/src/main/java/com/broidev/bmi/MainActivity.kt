package com.broidev.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val weightEditText = findViewById<EditText>(R.id.weightEditText)
        val heightEditText = findViewById<EditText>(R.id.heightEditText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val categoryTextView = findViewById<TextView>(R.id.categoryTextView)

        calculateButton.setOnClickListener {
            val weightStr = weightEditText.text.toString()
            val heightStr = heightEditText.text.toString()

            if (weightStr.isEmpty() || heightStr.isEmpty()) {
                Toast.makeText(this, "Proszę uzupełnić oba pola", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val weight = weightStr.toFloatOrNull()
            val heightCm = heightStr.toFloatOrNull()

            if (weight == null || heightCm == null || weight <= 0 || heightCm <= 0) {
                Toast.makeText(this, "Podaj prawidłowe wartości", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Przeliczenie wzrostu na metry
            val heightM = heightCm / 100f
            
            // Obliczenie BMI
            val bmi = weight / (heightM * heightM)

            // Wyświetlenie wyniku z dokładnością do 1 miejsca po przecinku
            resultTextView.text = "Twoje BMI: " + String.format("%.1f", bmi)

            // Sprawdzenie kategorii
            val category: String
            if (bmi < 18.5f) {
                category = "niedowaga"
            } else if (bmi < 25f) {
                category = "norma"
            } else {
                category = "nadwaga"
            }

            categoryTextView.text = "Kategoria: " + category
        }
    }
}
