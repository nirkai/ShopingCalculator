package com.davnik.shopingcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            calc()
        }

    }

    fun calc():Int{
        val units1 = findViewById<EditText>(R.id.unit_editText1)
        val units2 = findViewById<EditText>(R.id.unit_editText2)
        val amount1 = findViewById<EditText>(R.id.amount_editText1)
        val amount2 = findViewById<EditText>(R.id.amount_editText2)
        val price1 = findViewById<EditText>(R.id.price_editText1)
        val price2 = findViewById<EditText>(R.id.price_editText2)

        if (units1 != null && units2 != null && amount1 != null && amount2 != null && price1 != null && price2 != null){
            var total1 = price1.text.toString().toDouble() / (units1.text.toString().toDouble() * amount1.text.toString().toDouble())
            var total2 = price2.text.toString().toDouble() / (units2.text.toString().toDouble() * amount2.text.toString().toDouble())
            if (total1 > total2)
                Toast.makeText(this, "The second is low", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "The first is low", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "You must fill all the fileds", Toast.LENGTH_LONG)
        }
        return 0
    }
}
