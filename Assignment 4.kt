//Write a kotlin program that finds the maximum and minimum of three numbers (the numbers can be declared using variables)

fun main(){
    println("Enter three numbers:")
    var num1 = readLine()?.toDoubleOrNull()
    var num2 = readLine()?.toDoubleOrNull()
    var num3 = readLine()?.toDoubleOrNull()


    if (num1 != null && num2 != null && num3 != null){
        var max = maxOf(num1,num2,num3)
        var min = minOf(num1,num2,num3)

        println("Maximum number: $max")
        println("Minimum number: $min")
    }else{
        println("Invalid input.Please enter valid numbers")
    }

}