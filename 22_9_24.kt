fun main(){
    var a = 10
    var b = 5
    val isTrue = true
    val isFalse = false
    val add = a + b
    
    //Arithematic Operators
    println("Addition: $a + $b = $add ")
    println("Multiplication: $a * $b = ${a*b}")
    println("Substraction: $a - $b = ${a-b}")
    println("Division: $a / $b = ${a/b}")
    println("Modulus: $a % $b = ${a%b}\n")
    
    //Relational Operators
    println("Greater than: $a > $b is ${a.compareTo(b)>0} ")
    println("Less than: $a < $b is ${a<b} ")
    println("Greater than or equal to: $a >= $b is ${a>=b} ")
    println("Lesser than or equal to: $a <= $b is ${a<=b} ")
    println("is equal to: $a = $b is ${a==b} ")
    println("is not equal to: $a != $b is ${a!=b}\n ")
    
    //Assignment Operators
    print("a= $a b= $b ")
    a+=b
    println(" After a+=b, a is ${a}")
    print("a= $a b= $b ")
    a-=b
    println(" After a-=b, a is ${a}")
    print("a= $a b= $b ")
    a*=b
    println(" After a*=b, a is ${a}")
    print("a= $a b= $b ")
    a/=b
    println(" After a/=b, a is ${a}")
    print("a= $a b= $b ")
    a%=b
    println(" After a%=b, a is ${a}\n")
    
    //Unary Operators
    a=10
    print("a=$a")
    a=+a
    println(" +a=${a}")
    print("a=$a")
    a=-a
    println(" -a=${a}")
    print("a=$a")
    ++a
    println(" ++a=${a}")
    print("a=$a")
    --a
    println(" --a=${a}")
    print("a=$a")
    //a=!a
    println(" !a=${a}\n")
    
    //Logical Operators
    println("AND: $isTrue and $isFalse is ${isTrue&&isFalse}")
    println("OR: $isTrue or $isFalse is ${isTrue||isFalse}") 
    println("NOT: $isTrue not is ${!isTrue}\n")    
}