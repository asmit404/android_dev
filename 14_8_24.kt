// Class 1
fun main(args:Array<String>){
    var a = 40
    println(a)
    val `try` = 20
    print(`try`)
    `try` = 20 + a
    print(`try`)
}

fun main(args:Array<String>){
    var a = 40
    var b : String= "sambhav"
    println(a)
    print(b)
}

fun main(){
    var message = "hello"
    print(message)
}
print(message)

class person{
    var message = "hello"
    fun displayinfo(){
        print(message)
    }
}
fun main(){
    val per_son= person
    person.displayinfo(message)
}
