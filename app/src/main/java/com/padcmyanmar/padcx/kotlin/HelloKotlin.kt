package com.padcmyanmar.padcx.kotlin

lateinit var value2: String
//val value3 : String Error
//var value4 : String Error

fun main() {
//Variables
    val value = "String"
    //value = "Charactor" Error

    var value1 = "String"
    value1 = "Charactor"

    value2 = "String"

//DataTypes
    var data1 = 0.1
    var data2 = 1

    data1 = data2.toDouble()
    data2 = data1.toInt()

//Collections
    val mylist = listOf<Int>()
    val myMutableList = mutableListOf(1,2,3)
    //mylist.add(4) Error
    myMutableList.add(4)

    val myMap = mapOf<Int,String>()
    val myMutableMap = mutableMapOf(1 to "Apple",2 to "banana",3 to "pineapple")
    //myMap.put(4,"grape") Error
    myMutableMap.put(4,"grape")
    myMutableMap[4]="orange" //Overwrite 4

    val mySet = setOf<Int>() //not allow duplicate or overwrite
    val myMutableSet = mutableSetOf(1,2,3,4)
    myMutableSet.add(5)
}