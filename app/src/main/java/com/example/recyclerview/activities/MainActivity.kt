package com.example.recyclerview.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.recyclerview.R
import com.example.recyclerview.showToast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnShowToast = findViewById<Button>(R.id.btnShowToast)
        btnShowToast?.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            showToast("Button was clicked")
        }
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val editTextText = findViewById<EditText>(R.id.editTextText)
            val message = editTextText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
        val btnsharetootherapps = findViewById<Button>(R.id.btnsharetootherapps)
        btnsharetootherapps.setOnClickListener {
            val editTextText = findViewById<EditText>(R.id.editTextText)
            val message = editTextText.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "share to: "))
        }
        val btnrecyclerviewdemo = findViewById<Button>(R.id.btnrecyclerviewdemo)
        btnrecyclerviewdemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}