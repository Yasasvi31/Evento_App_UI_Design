package com.example.madlabexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Started : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_started)

        val button: Button = findViewById(R.id.start_button)

        button.setOnClickListener {
            val intent = Intent(this,LogIn::class.java)
            startActivity(intent)
        }
    }
}