package com.websarva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //ボタンをクリックした時のリスナクラス
    private inner class HelloListener : View.OnClickListener{
        override fun onClick(view:View){
            val input = findViewById<EditText>(R.id.etName)
            val output = findViewById<TextView>(R.id.tvOutput)
            val inputStr = input.text.toString()
            output.text = inputStr + "さん、こんにちは！"
        }
    }
}