fun main() {

    var maths : Int = 84
    var physics : Int = 79
    var chem : Int = 69
    var bio : Int = 73


    var average: Int = ((maths)+(physics)+(chem)+(bio)) / 4

    println("$average")

    if (average < 0) {
        println("Invalid")
    }else if (average > 100) {
        println("Invalid")
    }else if (average > 80) {
        println("A")
    }else if (average > 75) {
        println("A-")
    }else if (average > 70) {
        println("B+")
    }else if (average > 65) {
        println("B")
    }else if (average > 60){
        println("B-")
    }else if (average > 55) {
        println("C+")
    }else if (average > 50) {
        println("C")
    }else if (average > 45) {
        println("C-")
    }else if (average > 40) {
        println("D+")
    }else if (average > 35) {
        println("D")
    }else if (average > 30) {
        println("D-")
    }else {
        println("E")
    }




//    while loop

    var grade = 5

    while (grade > -10) {
        println(grade)
        grade--
    }



}