package com.example.project4_1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity:AppCompatActivity() {
    lateinit var edit1: EditText;
    lateinit var edit2: EditText
    lateinit var btnAdd: Button;
    lateinit var btnSub: Button
    lateinit var btnMul: Button;
    lateinit var btnDiv: Button
    lateinit var btnResult: Button;
    lateinit var textResult: TextView
    var num1 : Double? = null
    var num2 : Double? = null
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"
        edit1 = edit1.findViewById<EditText>(R.id.Edit1)
        edit2 = edit2.findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        btnResult = findViewById<Button>(R.id.BtnRest)

        btnAdd.setOnClickListener {
            val num1: String = edit1.text.toString()
            val num2: String = edit2.text.toString()
            if (edit1.equals("") || edit2.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                val result = num1.toDouble() + num2.toDouble()
                textResult.text = "계산 결과: " + result.toDouble()
                false
            }
        }


        btnSub.setOnClickListener {
            val num1: String = edit1.text.toString()
            val num2: String = edit2.text.toString()
            if (edit1.equals("") || edit2.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                val result = num1.toDouble() - num2.toDouble()
                textResult.text = "계산 결과: " + result.toDouble()
                false
            }
        }

        btnMul.setOnClickListener {
            val num1: String = edit1.text.toString()
            val num2: String = edit2.text.toString()
            if (edit1.equals("") || edit2.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                val result = num1.toDouble() * num2.toDouble()
                textResult.text = "계산 결과: " + result.toDouble()
                false
            }
        }

        btnDiv.setOnClickListener {
            val num1: String = edit1.text.toString()
            val num2: String = edit2.text.toString()
            if (edit1.equals("") || edit2.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를입력하세요", Toast.LENGTH_SHORT).show();
            } else {
                if(edit2.equals("")){
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없음", Toast.LENGTH_SHORT).show();
                }else {
                    val result = num1.toDouble() / num2.toDouble()
                    textResult.text = "계산 결과: " + result.toDouble()
                    false
                }
            }
        }

        btnResult.setOnClickListener {
            val num1: String = edit1.text.toString()
            val num2: String = edit2.text.toString()
            if (edit1.equals("") || edit2.equals("")) {
                Toast.makeText(getApplicationContext(), "숫자를입력하세요", Toast.LENGTH_SHORT).show();
            } else {

                val result = num1.toDouble() + num2.toDouble()
                textResult.text = "계산 결과: " + result.toDouble()
                false
            }
        }
    }
}