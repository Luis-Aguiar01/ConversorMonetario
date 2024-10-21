package br.edu.ifsp.dmo1.conversormonetario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val DOLLAR_VALUE = 5.50

    private lateinit var inputValue: EditText
    private lateinit var convertDollarButton: Button
    private lateinit var conversionResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputValue = findViewById(R.id.input_value)
        convertDollarButton = findViewById(R.id.convert_dollar_button)
        conversionResult = findViewById(R.id.conversion_result)
    }
}