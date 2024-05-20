package com.example.madlabexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Favourites : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)


        val listicon2: ImageView = findViewById(R.id.listimage1)


        listicon2.setOnClickListener {
            val intent = Intent(this,ListingEvent::class.java)
            startActivity(intent)
        }

        val homeicon2: ImageView = findViewById(R.id.homeimage1)


        homeicon2.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        val profileicon2: ImageView = findViewById(R.id.profileimage1)


        profileicon2.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
        }


    }
}