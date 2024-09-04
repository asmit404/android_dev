// Primary Constructor
class primaryPerson(var name: String, var age: Int) {
    // Secondary constructor with only name, default age is 0
    constructor(name: String) : this(name, 0)
    
    // Secondary constructor with default name "ABC" and age 12
    constructor() : this("ABC", 12)

    // Function to print the introduction of the person
    fun intro() {
        println("My name is $name and my age is $age")
    }
}

// Secondary Constructor
class secondaryPerson {
    // Properties to hold the name and age of the person
    var name: String
    var age: Int

    // Constructor with both name and age
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // Constructor with only name, default age is 12
    constructor(name: String) {
        this.name = name
        this.age = 12
    }

    // Default constructor with default name "dumb" and age 10
    constructor() {
        this.name = "dumb"
        this.age = 10
    }

    // Function to print the introduction of the person
    fun intro() {
        println("My name is $name and age is $age")
    }
}

fun main(){
    var a = primaryPerson()
    a.intro()
    var b = primaryPerson("ABC",15)
    b.intro()
    var c = primaryPerson("DEF")
    c.intro()

    val d = secondaryPerson()
    d.intro()
    val e = secondaryPerson("GHI")
    e.intro()
    val f = secondaryPerson("JKL", 19)
    f.intro()
}

// Class to calculate the area of a rectangle and a square
open class Rectangle(var length: Double, var width: Double) {

    // Function to calculate the area of the rectangle
    fun area(): Double {
        return length * width
    }

    // Function to display the area of the rectangle
    open fun display() {
        println("Area of the rectangle is ${area()}")
    }
}

// Class to calculate the area of a square, inheriting from Rectangle
class Square(side: Double) : Rectangle(side, side) {

    // Function to display the area of the square
    override fun display() {
        println("Area of the square is ${area()}")
    }
}

fun main() {
    // Create a rectangle object with length 4.0 and width 5.0
    val rectangle = Rectangle(4.0, 5.0)
    rectangle.display()

    // Create a square object with side length 4.0
    val square = Square(4.0)
    square.display()
}
