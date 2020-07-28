package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page2.*
import kotlinx.android.synthetic.main.activity_page4.*

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        button6.setOnClickListener {
            val intent = Intent(baseContext, page3::class.java)
        }
        button5.setOnClickListener {
            val intent = Intent (baseContext,page5::class.java)
        }

    }
}