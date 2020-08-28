package com.padcmyanmar.padcx.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_check_palindrome.setOnClickListener {
            startActivity(Intent(this,PalindromeCheck::class.java))
        }

        btn_check_parentheses.setOnClickListener {
            startActivity(Intent(this,CheckBalancedParentheses::class.java))
        }
    }
}