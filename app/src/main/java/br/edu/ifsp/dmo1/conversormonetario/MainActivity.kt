package br.edu.ifsp.dmo1.conversormonetario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val DOLLAR_VALUE = 5.50

    private lateinit var inputValueEditText: EditText
    private lateinit var buttonConvertToDollar: Button
    private lateinit var buttonConvertToReal: Button
    private lateinit var conversionResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputValueEditText = findViewById(R.id.input_value)
        buttonConvertToDollar = findViewById(R.id.convert_to_dollar_button)
        buttonConvertToReal = findViewById(R.id.convert_to_real_button)
        conversionResult = findViewById(R.id.conversion_result)

        var result: Double

        buttonConvertToDollar.setOnClickListener {
            val inputValue = inputValueEditText.text.toString().toDouble()
            result = inputValue / DOLLAR_VALUE
            conversionResult.text = "US $result"
        }

        buttonConvertToReal.setOnClickListener {
            val inputValue = inputValueEditText.text.toString().toDouble()
            result = inputValue * DOLLAR_VALUE
            conversionResult.text = "R$ $result"
        }
    }
}