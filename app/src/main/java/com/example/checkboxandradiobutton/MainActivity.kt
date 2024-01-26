package com.example.checkboxandradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.checkboxandradiobutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    public lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnOrder.setOnClickListener {
            val checkedMeatRadioButton = binding.rgMeat.checkedRadioButtonId
            val meatOrder = findViewById<RadioButton>(checkedMeatRadioButton)
            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked
            val orderString = "You ordered a burger with:\n" +
                    "${meatOrder.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")
            binding.tvOrders.text = orderString
        }
    }
}