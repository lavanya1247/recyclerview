package com.example.recyclerview.activities

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.R
import com.example.recyclerview.showToast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle: Bundle? = intent.extras
        val msg:String? = bundle!!.getString("user_message")
        msg?.let { showToast(it) }
        val txvUserMessage = findViewById<TextView>(R.id.txvUserMessage)
        txvUserMessage.text = msg
    }
}