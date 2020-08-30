package com.padcmyanmar.padcx.kotlin

import kotlinx.coroutines.*

//fun main(){
//    GlobalScope.launch {
//        delay(2000)
//        println("World.")
//    }//run in backgroud threat
//    println("Hello!")
//    Thread.sleep(5000)
//}

//fun main(){
//    GlobalScope.launch {
//        delay(1000)
//        println("World")
//    }
//    println("Hello")
//    runBlocking {
//        delay(3000)
//    }
//}


//fun run()= runBlocking {
//    println("Hello!")
//    delay(2000)
//}
//fun main(){
//    println("Hi")
//    Thread.sleep(1000)
//    run()
//    println("World!")
//}

//suspend fun doJob(){
//    println("Hello!")
//    delay(1000)
//}
//fun main(){
//    println("Hi")
//    runBlocking {
//        doJob()
//    }
//    println("Over.")
//    Thread.sleep(2000)
//}

//val doJob = GlobalScope.launch {
//    println("Hello!")
//}
//suspend fun main(){
//    println("Hi")
//    doJob.join()
//    println("World")
//}

fun main()= runBlocking {

    launch {
        delay(1000)
        println("Over.")
    }
    coroutineScope {
        launch {
            delay(500)
            println("Hello")
        }
        delay(100)
        println("Hi")
    }
    println("World")
}

