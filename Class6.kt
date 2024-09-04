// Demonstrates various types of for loops and while loops in Kotlin
fun main() {
    println(".. :")
    for (number in 1..5) {
        println(2 * number)
    }
    
    // Using 'until' to iterate from 1 to 4 (5 is excluded)
    println("Until :")
    for (number in 1 until 5) {
        println(4 * number)
    }
    
    // Using 'downTo' to iterate from 8 down to 2 with a step of 2
    println("downTo :")
    for (number in 8 downTo 2 step 2) {
        println(6 * number)
    }
    
    // Iterating over an array of fruits
    println("with arrayOf :")
    val fruits = arrayOf("apple", "banana", "orange")
    for (fruit in fruits) {
        println("$fruit")
    }
    
    // Iterating over a list of fruits using indices
    println("with listOf :")
    val fruitList = listOf("apple ", "banana ", "orange ")
    for (index in fruitList.indices) {
        print("${fruitList[index]}")
    }
    
    // Using a while loop to countdown from 5 to 1
    var countdown = 5
    while (countdown > 0) {
        println(countdown)
        countdown--
    }
    
    // Using a do-while loop to countdown from 5 to 1
    var doWhileCountdown = 5
    do {
        print("$doWhileCountdown ")
        doWhileCountdown--
    } while (doWhileCountdown > 0)
}