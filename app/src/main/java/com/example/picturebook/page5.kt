package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page2.*
import kotlinx.android.synthetic.main.activity_page5.*

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        button7.setOnClickListener {
            val intent = Intent(baseContext, page4 ::class.java)
        }

    }
}