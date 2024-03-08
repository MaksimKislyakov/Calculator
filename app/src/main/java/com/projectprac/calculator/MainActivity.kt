package com.projectprac.calculator

import ActivityMainBinding
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.btn_0)
        //binding = ActivityMainBinding.inflate(layoutInflater) // Инициализируйте binding
        //setContentView(binding.root) // Установите корневое представление

        setContentView(R.layout.activity_main)

        binding.btn_0.setOnClickListener { setTextFields("0") }
        binding.btn_1.setOnClickListener { setTextFields("1") }
        binding.btn_2.setOnClickListener { setTextFields("2") }
        binding.btn_3.setOnClickListener { setTextFields("3") }
        binding.btn_4.setOnClickListener { setTextFields("4") }
        binding.btn_5.setOnClickListener { setTextFields("5") }
        binding.btn_6.setOnClickListener { setTextFields("6") }
        binding.btn_7.setOnClickListener { setTextFields("7") }
        binding.btn_8.setOnClickListener { setTextFields("8") }
        binding.btn_9.setOnClickListener { setTextFields("9") }
        binding.minusBtn.setOnClickListener{ setTextFields("-") }
        binding.plusBtn.setOnClickListener{ setTextFields("+") }
        binding.multiplyBtn.setOnClickListener{ setTextFields("*") }
        binding.divideBtn.setOnClickListener{ setTextFields("/") }
        binding.rightBracketBtn.setOnClickListener{ setTextFields(")") }
        binding.leftBracketBtn.setOnClickListener{ setTextFields("(") }

        binding.allCleanBtn.setOnClickListener {
            binding.mathOperation.text = ""
            binding.result.text = ""
        }

        binding.clearBtn.setOnClickListener {
            val str = binding.mathOperation.text.toString()
            if(str.isNotEmpty())
                binding.mathOperation.text = str.substring(0, str.length - 1)

            binding.result.text = ""
        }
    }

    fun returnText() {
        binding.btn_0.setOnClickListener { setTextFields("0") }
    }

    fun setTextFields(str: String) {
        binding.mathOperation.append(str)
    }
}