package com.padcmyanmar.padcx.kotlin

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_check_balanced_parentheses.*
import java.util.*
import kotlin.collections.ArrayList


class CheckBalancedParentheses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_balanced_parentheses)

        checkOnePair()

        btn_back_balanced.setOnClickListener {
            finish()
        }
    }
    fun checkOnePair(){
        btn_check_balanced.setOnClickListener {
            var string = et_balanced.text.toString()

            if (string.isEmpty()) tv_result_balanced.text = "Balanced"

            var stack: Deque<Char> = ArrayDeque()

            var length = string.length
            var y: Char

            for (i in 0..length - 1) {
                var x = string[i]
                if (x == '(' || x == '[' || x == '{') {
                    stack.push(x)
                }

                if (stack.isEmpty()) tv_result_balanced.text = "Not Balanced"

                when (x) {
                    ')' -> {
                        y = stack.peek()
                        stack.pop()
                        if (y == '{' || y == '[') tv_result_balanced.text = "Not Banlanced"
                    }
                    '}' -> {
                        y = stack.peek()
                        stack.pop()
                        if (y == '(' || y == '[') tv_result_balanced.text = "Not Balanced"
                    }
                    ']' -> {
                        y = stack.peek()
                        stack.pop()
                        if (y == '(' || y == '{') tv_result_balanced.text = "Not Balanced"
                    }
                    else -> tv_result_balanced.text = "Balanced"
                }
            }
            stack.clear()
            hideKeyboardFrom(this, window.decorView)
        }

    }

    fun hideKeyboardFrom(context: Context, view: View) {
        val imm =
            context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }

}

fun main(){

    val scanner = Scanner(System.`in`)
    println("Enter parentheses pairs : ")
    val value = scanner.nextLine()

    var curlyCount = 0
    var boxCount = 0
    var roundCount =0
    var curlyRight = false
    var boxRight = false
    var roundRight = false
    var notBalancedParentheses = false

    for ( input in value){
        if (input == '{'){
            if (value.contains('}')){
                curlyCount += 1
            }else{
                notBalancedParentheses=true
                curlyRight=false
            }
        }else{
            curlyRight=true
        }
        if (input == '('){
            if (value.contains(')')){
                roundCount += 1
            }else{
                notBalancedParentheses=true
                roundRight=false
            }
        }else{
            roundRight=true
        }
        if (input == '['){
            if (value.contains(']')){
                boxCount += 1
            }else{
                notBalancedParentheses=true
                boxRight=false
            }
        }else{
            boxRight=true
        }
    }

    if (notBalancedParentheses == false){
        println(" ( )= $roundCount , { }= $curlyCount , [ ]= $boxCount")
    }else{
        println("No Balanced Pair")
    }

}



