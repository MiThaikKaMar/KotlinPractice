package com.padcmyanmar.padcx.kotlin

//higher-order function
fun numberListCalculate(
    numberList: List<Int>,
    operator: Char,
    calculate: (Int, Int, Char) -> Int
): Int {
    var initialValue = 1

    for (num in numberList) {
        initialValue = calculate(num, initialValue, operator)
    }
    return initialValue
}

val numList = listOf(1, 2, 3, 4, 5)


//Lambda expression with higher-order function
fun main() {

//Lambda in main function
    val resultValue = numberListCalculate(
        numberList = numList,
        operator = '-',
        calculate = { num1, num2, operator ->
            when (operator) {
                '+' -> num1 + num2
                '-' -> num1 - num2
                '*' -> num1 * num2
                '/' -> num1 / num2
                else -> 0
            }
        })

    //lambda in variable
    val calNumList: (num1: Int, num2: Int, operator: Char) -> Int = { num1, num2, operator ->
        when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> num1 / num2
            else -> 0
        }
    }
    val resultValue1 =
        numberListCalculate(numberList = numList, operator = '-', calculate = calNumList)


    //another way ( if lastest parameter is a function ,you can write expression in body
    val resultValue2 =
        numberListCalculate(numberList = numList, operator = '-') { num1, num2, operator ->
            when (operator) {
                '+' -> num1 + num2
                '-' -> num1 - num2
                '*' -> num1 * num2
                '/' -> num1 / num2
                else -> 0
            }
        }

    println("Result $resultValue")
}