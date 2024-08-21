//CLass 2
//string_interpolation
fun main(){
    val a = 10
    val b = 20
    val res = "sum of $a and $b is ${a+b}"
    print(res)
}

//char datatype
fun main(){
    val letter:Char
    letter = 'A'
    print("$letter")
    print('\n')
    print('\$')
    print('\\')
}

//string datatype
fun main(){
    val name:String
    name = """ram
ram
ram
ram"""
    print(name)
}

//tic-tak-toe 
fun main(){
    val name:String
    name = """    ram
ram     ram
    ram"""
    print(name)
}

//array
fun main(){
    //array of int
    val numbers= arrayOf(1,2,3,4,5)
    //array of string
    val words:Array<string>= arrayOf("Kotlin")
    //array of squares using lambda function
    val squares = Array(5){i -> i*i}
    //accessing elements
    val firstno=numbers[0]
    val secondno=numbers[1]
}
