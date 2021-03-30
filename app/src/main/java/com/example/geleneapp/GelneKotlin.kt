package com.example.geleneapp

fun main() {
//    immutable variable
//    TODO: Add new functionality

    /*
    This
    is a multiline
    comment
    */
//type string
    var myName = "Frank"
//    type int
    var myAge = 31

//    Strings

    val myStr = "Hello World"
    var firstcCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //print("first Character is " + firstcCharInStr)

    //Arithmetic operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5
    val b = 3
    var resultDouble: Double
    resultDouble = (a / b).toDouble()
    //print(resultDouble)

    //Comparison operatrors (==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
//    println("isEqual is $isEqual")

    val isNotEqual = 5 != 5
    //String interpolation
    //println("isNotEqual is $isNotEqual")
    //println("is-5greater3 ${-5 < 3}")
    //println("is5LowerEqual3 ${5 <= 3}")
    //println("is5GreaterEqual3 ${5 >= 3}")

    //Assignment operators ( +=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    myNum *= 4
    //println("myNum is $myNum")

    //Increment & Decrement operators ( ++, --)
    myNum++
    //println("myNum is $myNum")
    //println("myNum is ${myNum++}")
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 160

    if (heightPerson1 > heightPerson2) {
        //println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        //println("use your power technique 1234")
    } else {
        //println("use technique")
    }

    val age = 17

    if (age <= 22) {
        //println("You find a job")
    } else if (age == 25) {
        //println("You can marry your boyfriend")
    } else {
        //println("You can have a baby")

    }
//    when(age){
//        in 21..99 -> println("You may travel")
//        in 18..20 -> println("You may find someone")
//        16,17 -> println("You can have your student's license")
//        else -> println("Ikaw ay bata pa")
//    }
//
//    var x : Any = "13.37f"
//    when(x){
//        is Int -> println("$x is an nt")
//        !is Double -> println("$x is not a Double")
//        is String -> println("$x is a String")
//        else -> println("$x is none of the above")
//    }
    //While loop
//    var x = 1
//    while(x <= 10){
//        print("$x")
//        x++
//    }
//    println("\n while loop is done")

//    var x = 100
//    while (x >= 0) {
//        print("$x")
//        x -= 2
//    }
//    println("\nwhile loop os done")
//    x = 1
//    do {
//        print("$x")
//        x++
//    } while (x <= 10)
//    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20)
            feltTemp = "comfy"
            println("it's comfy now")
    }


//    var name = "Denis"

//    if (name == "denis"){
//        //println("Welcome home denis")
//    }else{
//        //println("Who are you?")
//    }
//     var isRainy = true
//    if(isRainy)
        //println("It's rainy")


//    var season = 3
//    when(season) {
////        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("winter")
//            else -> println("Invalid Season")
//
//    }
//        var month = 3
//        when(month){
//            in 3..5 -> println("Spring")
//            in 6..8 -> println("Summer")
//            in 9..11 -> println("Fall")
//            12, 1, 2 -> println("Winter")
//            else -> println("Invalid Season")
//        }



}