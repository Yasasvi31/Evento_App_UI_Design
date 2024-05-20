package com.example.madlabexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val adddicon: ImageView = findViewById(R.id.imageaddevent)


        adddicon.setOnClickListener {
            val intent = Intent(this,AddEvent::class.java)
            startActivity(intent)
        }
        val backicon: ImageView = findViewById(R.id.backbutton)


        backicon.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        val homeicon4: ImageView = findViewById(R.id.homeimage4)


        homeicon4.setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        val listicon4: ImageView = findViewById(R.id.listimage4)


        listicon4.setOnClickListener {
            val intent = Intent(this,ListingEvent::class.java)
            startActivity(intent)
        }

        val favicon4: ImageView = findViewById(R.id.favimage4)


        favicon4.setOnClickListener {
            val intent = Intent(this,Favourites::class.java)
            startActivity(intent)
        }




    }
}