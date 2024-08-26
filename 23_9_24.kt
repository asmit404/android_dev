fun main(){
    var temp = 25
    if(temp > 20){
        println("$temp->It's a warm day")
    }
}

fun main(){
    var age = 18
    if(age >= 18){
        println("You are an adult")
    }
    else{
        println("You are a minor")
    }
}

fun main(){
    var marks = 89
    if(marks >= 90){
        println("Grade: A")
    }
    else if(marks >= 85){
        println("Grade: B")
    }
    else if(marks >= 70){
        println("Grade: C")
    }
    else{
        println("Grade: D")
    }
}

//Create a calculator with if else and all arithemetic operators
fun main(){
    var a = 9
    var b = 8
	var op = "%";
    if(op == "+"){
        println("Addition: $a + $b = ${a+b} ")
    }
    else if(op == "*"){
        println("Multiplication: $a * $b = ${a*b}")
    }
    else if(op == "-"){
        println("Substraction: $a - $b = ${a-b}")
    }
    else if(op == "/"){
        if(b != 0){
        	println("Division: $a / $b = ${a/b}")
        }
        else{
            println("Error: Division by Zero")
        }
    }
    else if(op == "%"){
        println("Modulus: $a % $b = ${a%b}\n")
    }
    else{
        println("Error: Invalid Operator")
    }
}

fun main(){
	var age = 13
    if(age < 13){
        println("You are a child")
    }
    else if(age in 13..19){
        println("You are a Teenager")
    }
    else{
        println("You are an Adult")
    }
}

fun main(){
	var day = 7
    val dayName = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else->"Invalid Day"
    }
    println("It's $dayName.");
}

fun main(){
	var num = 8
    when{
        num%2 == 0 -> println("$num is Even.")
        num%2 != 0 -> println("$num is Odd.")
        //else -> println("Unexpected Number")
    }
}