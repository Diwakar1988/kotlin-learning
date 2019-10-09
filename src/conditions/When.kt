package conditions
/*
A switch case replacement: https://superkotlin.com/kotlin-when-statement/
There are two kinds of innovation: new perspectives that changes how we look at things and pragmatic improvements that changes how we do things. Kotlin is full of these pragmatic improvements, getting its user a language that just feel good to use. One of the most useful improvement, especially if you come from Java, is the when construct.
 */
fun main() {
    println("**************** printDiwakarIsFeeling(mood:String = \"relaxed\") ****************")
    printDiwakarIsFeeling() //default value will be used
    printDiwakarIsFeeling("angry")
    printDiwakarIsFeeling("blessed")
    printDiwakarIsFeeling("unknown")
    println("**************** checkNumber(num:Int) ****************")
    checkNumber(0)
    checkNumber(1)
    checkNumber(2)
    checkNumber(3)
    checkNumber(5)
    checkNumber(7)
    //smart cases
    println("**************** isValidType(x: Any) = when(x) ****************")
    isValidType("Diwakar")
    val result = isValidType(100L)
    println(result is Boolean)

}

fun isValidType(x: Any) = when(x) {
    is String -> print("It's a string")
    is Float -> print("It's a Float")
    is Int -> print("It's a Int")
    else -> false
}

fun checkNumber(num: Int) {
    when(num){
        0-> println("ZERO not allowed")
        1,2,3-> println("Very small number, can't use") //multiple same cases
        in 4..7-> println("Avg number, easy solvable") //range
        !in 100..Int.MAX_VALUE-> println("number too high, but solvable")
    }
}
fun printDiwakarIsFeeling(mood:String = "relaxed"){
    when(mood){
        "relaxed" -> println("We can talk since Diwakar is $mood")
        "angry"->println("Run away since Diwakar is  $mood")
        "blessed"->println("We can congratulate Diwakar because he is  $mood")
        else->println("Unknown mood")
    }
}