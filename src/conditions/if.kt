package conditions

/**
 * In Kotlin, if statements are expressions. So the following code is equivalent:
 *
 * The distinction between expression and statement is important here. In Java/C#/JavaScript, if forms a statement, meaning that it does not resolve to a value. More concretely, you can't assign it to a variable.
 */
fun main() {
    diwakarIsFeeling() //default value will be used
    diwakarIsFeeling("angry")
    diwakarIsFeeling("blessed")
    diwakarIsFeeling("unknown")

    val a =0
    val result  = if(a>1) 20 else 100 //
    print("val result  = if(a>1) 20 else 100 = $result")
}
fun diwakarIsFeeling(mood:String = "relaxed"){
    if (mood=="relaxed"){
        println("We can talk since Diwakar is $mood")
    }else if (mood=="angry"){
        println("Run away since Diwakar is  $mood")
    }else if (mood=="blessed"){
        println("We can congratulate Diwakar because he is  $mood")
    }else{
        println("Unknown mood")
    }
}