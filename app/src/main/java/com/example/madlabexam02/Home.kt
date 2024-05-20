package com.example.madlabexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listicon1:ImageView = findViewById(R.id.listimage2)


        listicon1.setOnClickListener {
            val intent = Intent(this,ListingEvent::class.java)
            startActivity(intent)
        }

        val favicon1:ImageView = findViewById(R.id.favimage2)


        favicon1.setOnClickListener {
            val intent = Intent(this,Favourites::class.java)
            startActivity(intent)
        }

        val profileicon1:ImageView = findViewById(R.id.profileimage2)


        profileicon1.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }

        val event1:ImageView = findViewById(R.id.imageeve)


        event1.setOnClickListener {
            val intent = Intent(this,Event::class.java)
            startActivity(intent)
        }


    }
}