package com.example.infinitelearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnSignup: Button = findViewById(R.id.btn_signup)
        btnSignup.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_signup -> {
                val intent = Intent(this@RegisterActivity,
                    LoginActivity::class.java)
                    startActivity(intent)
            }
        }
    }
}