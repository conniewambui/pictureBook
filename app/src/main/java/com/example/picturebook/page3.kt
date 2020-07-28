package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page2.*
import kotlinx.android.synthetic.main.activity_page3.*

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)


        button4.setOnClickListener {
            val intent = Intent(baseContext, page2::class.java)
        }
        button3.setOnClickListener {
            val intent = Intent (baseContext,page4::class.java)
        }
    }
}
