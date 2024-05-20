package com.example.madlabexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ListingEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing_event)

        val homeicon3: ImageView = findViewById(R.id.homeimage3)

        homeicon3.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        val favicon3: ImageView = findViewById(R.id.favimage3)

        favicon3.setOnClickListener {
            val intent = Intent(this,Favourites::class.java)
            startActivity(intent)
        }

        val profileicon3: ImageView = findViewById(R.id.profileimage3)

        profileicon3.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }


    }
}