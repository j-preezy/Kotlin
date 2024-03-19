//Write a kotlin program that takes in user input temperature in celcius and converts it to fahrenheit

fun main(){
    println("Enter temperature in Celsius:")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null){
        val fahrenheit = celsius *9/5 + 32
        println("The temperature in Fahrenheit is: $fahrenheit°F")
    }else{
        println("Invalid input. Please enter a valid temperature.")
    }
}