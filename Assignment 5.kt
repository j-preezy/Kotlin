//Write a kotlin program to calculate LCM using a while loop and if statement

fun calculateLCM(num1: Int, num2: Int): Int{
    var lcm = if (num1 > num2 ) num1 else num2

    while (true){
        if (lcm % num1 == 0 && lcm % num2 == 0){
            break
        }
        lcm++
    }

    return lcm

}
fun main(){
    val num1 = 24
    val num2 = 56
    val lcm = calculateLCM(num1, num2)
    println("The LCM of $num1 and $num2 is $lcm")
}