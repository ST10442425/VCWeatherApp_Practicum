package com.physc.vcweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {


    //declare variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val enterButton = findViewById<Button>(R.id.enterButton)
        enterButton.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)

        }




    }
}