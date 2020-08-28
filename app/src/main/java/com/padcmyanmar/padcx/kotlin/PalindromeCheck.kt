package com.padcmyanmar.padcx.kotlin

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.padcmyanmar.padcx.kotlin.R.*
import kotlinx.android.synthetic.main.activity_palindrome.*


class PalindromeCheck : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_palindrome)

        btn_check.setOnClickListener {

            var inputString = et_palindrome.text.toString()

            var reverseString = StringBuilder(inputString).reverse().toString()

            when {
                inputString == reverseString -> {
                    tv_result.text = "The text you entered is Palindrome and you pass the test."
                    tv_result.background =
                        ContextCompat.getDrawable(this, drawable.rounded_tv_yellow)
                    hideKeyboardFrom(this, window.decorView)
                }
                else -> {
                    tv_result.text = "You fail!, Please try with other text..."
                    et_palindrome.text = null
                    tv_result.background = ContextCompat.getDrawable(this, drawable.rounded_tv_red)
                    tv_result.setTextColor(ContextCompat.getColor(this, color.colorWhite))
                }
            }
        }

        btn_back.setOnClickListener {
            finish()
        }
    }

    fun hideKeyboardFrom(context: Context, view: View) {
        val imm =
            context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }


}
