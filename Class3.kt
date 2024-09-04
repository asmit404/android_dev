fun main() {
    // Array Indices
    val numbers = arrayOf(1,2,3,4,5)
    val sqr = Array(5) {i -> i * i}
    val ind0 = numbers[0]
    val ind1 = sqr[2]
    println("$ind0")
    println("$ind1")
    
    // For Loops
    for(num in numbers){
        print(num)
    }
    println("")
    for(num in sqr){
        print(num)
    }
    println("")
    
    // Multi-Dimensional Array
    val mat: Array<Array<Int>> = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println("${mat[1][1]}")
    
    // Type Mismatch
    val x: Int = 100
    val y: Long = x.toLong()
 	println(y)

    //Unsafe Type Casting
    val a1 = "hi"
    val b1: String = a1 as String
    println("$b1")
    
    //Safe Type Casting
    val a2 = "hi"
    val b2: String = a2 as? String
    println("$b2")
}