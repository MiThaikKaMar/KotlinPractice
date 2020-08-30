package com.padcmyanmar.padcx.kotlin

class Developer(val name : String) {
companion object{
    val position="MM"
}
}

fun main(){
    println("Reverse String is ${"level2".isPalindrome()}")
    println(Developer("Mi Thaik").getFirstName())
    println(Developer("Mi Thaik").address)
    println(Developer.getPosition())
}

fun String.isPalindrome() : Boolean{
    var reverse = ""
    for (i in this.length-1 downTo 0){
        reverse += this[i]
    }
    if (this == reverse) return true
    return false
}

//fuction Extension
fun Developer.getFirstName(): String{
    return name.split("").first()
}

//propertyExtension
val Developer.address : String
        get() = "Yangon"

//Companion Extension
fun Developer.Companion.getPosition() : String{
    return this.position
}