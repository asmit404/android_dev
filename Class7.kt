// Function to sum two integers with default values
fun sumWithDefaults(a: Int = 10, b: Int = 20) {
    val result = a + b
    println(result)
}

// Function to sum two integers without default values
fun sumWithoutDefaults(a: Int, b: Int) {
    val result = a + b
    println(result)
}

// Function to sum two integers and return the result
fun sumAndReturn(a: Int, b: Int): Int {
    val result = a + b
    return result
}

// Function to convert Celsius to Fahrenheit
fun celsiusToFahrenheit(celsius: Int): Int {
    val fahrenheit = (9 / 5 * celsius) + 32
    return fahrenheit
}

fun main() {
    // Test sumWithDefaults function
    sumWithDefaults(20, 50) // Sum with provided values
    sumWithDefaults()       // Sum with default values

    // Test sumWithoutDefaults function
    sumWithoutDefaults(20, 50) // Sum with provided values
    sumWithoutDefaults()    // This will not work as no values are passed

    // Test sumAndReturn function
    val num1 = 10
    val num2 = 20
    val result = sumAndReturn(num1, num2)
    println(result)

    // Test celsiusToFahrenheit function
    val celsius = 10
    val fahrenheitResult = celsiusToFahrenheit(celsius)
    println(fahrenheitResult)
}