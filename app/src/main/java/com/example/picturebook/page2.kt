package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page2.*

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        button2.setOnClickListener {
            val intent = Intent(baseContext, MainActivity ::class.java)
        }
        button.setOnClickListener {
            val intent = Intent (baseContext,page3::class.java)
        }
    }
    
}