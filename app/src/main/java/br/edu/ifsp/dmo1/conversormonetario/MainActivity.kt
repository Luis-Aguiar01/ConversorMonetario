package br.edu.ifsp.dmo1.conversormonetario

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), OnClickListener {

    private val dollarValue = 5.50
    private val decimalFormatter = DecimalFormat("#.##")

    private lateinit var inputValueEditText: EditText
    private lateinit var buttonConvertToDollar: Button
    private lateinit var buttonConvertToReal: Button
    private lateinit var conversionResultText: TextView
    private lateinit var textResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeVariables()
        setButtonListener()
    }

    override fun onClick(view: View) {
        if (view == buttonConvertToReal) {
            convertToReal()
        } else if (view == buttonConvertToDollar) {
            convertToDollar()
        }
    }

    private fun getInputValue() = try {
            inputValueEditText.text.toString().toDouble()
        } catch (e: NumberFormatException) {
            0.0
        }

    private fun convertToDollar() {
        val valueInReal = getInputValue()
        val dollar = valueInReal / dollarValue
        conversionResultText.text = "US$ ${decimalFormatter.format(dollar)}"
        textResult.text = "Valor da conversão para dólar:"
    }

    private fun convertToReal() {
        val valueInDollar = getInputValue()
        val real = valueInDollar * dollarValue
        conversionResultText.text = "R$ ${decimalFormatter.format(real)}"
        textResult.text = "Valor da conversão para reais:"
    }

    private fun setButtonListener() {
        buttonConvertToDollar.setOnClickListener(this)
        buttonConvertToReal.setOnClickListener(this)
    }

    private fun initializeVariables() {
        inputValueEditText = findViewById(R.id.input_value)
        buttonConvertToDollar = findViewById(R.id.convert_to_dollar_button)
        buttonConvertToReal = findViewById(R.id.convert_to_real_button)
        conversionResultText = findViewById(R.id.conversion_result)
        textResult = findViewById(R.id.text_result)
    }
}