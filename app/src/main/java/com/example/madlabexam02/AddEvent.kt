package com.example.madlabexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AddEvent : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_event)

        val backicon2: ImageView = findViewById(R.id.backbutton2)


        backicon2.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }

    }
}