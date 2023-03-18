package com.example.assign3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun onClick(view: View?){
        if (view is Button)
        {
            val intent = Intent(this,SignUpActivity::class.java);
            startActivity(intent);
        }

    }
}