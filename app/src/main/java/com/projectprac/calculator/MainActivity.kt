package com.projectprac.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.projectprac.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn0.setOnClickListener { setTextFields("0") }
        binding.btn1.setOnClickListener { setTextFields("1") }
        binding.btn2.setOnClickListener { setTextFields("2") }
        binding.btn3.setOnClickListener { setTextFields("3") }
        binding.btn4.setOnClickListener { setTextFields("4") }
        binding.btn5.setOnClickListener { setTextFields("5") }
        binding.btn6.setOnClickListener { setTextFields("6") }
        binding.btn7.setOnClickListener { setTextFields("7") }
        binding.btn8.setOnClickListener { setTextFields("8") }
        binding.btn9.setOnClickListener { setTextFields("9") }
        binding.pointBtn.setOnClickListener { setTextFields(".") }
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

        binding.equalBtn.setOnClickListener {
            try {
                val ex = ExpressionBuilder(binding.mathOperation.text.toString()).build()
                val endResult = ex.evaluate()

                val longResult = endResult.toLong()
                if(endResult == longResult.toDouble())
                    binding.result.text = longResult.toString()
                else
                    binding.result.text = endResult.toString()
        } catch (e:Exception) {
                Log.d("Error", "Message: ${e.message}")
            }
        }
    }


    @SuppressLint("SuspiciousIndentation")
    private fun setTextFields(str: String) {
        if (binding.result.text != "")
            binding.mathOperation.text = binding.result.text
            binding.result.text = ""
        binding.mathOperation.append(str)
    }

}