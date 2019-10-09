package conditions

fun main() {
    diwakarIsFeeling() //default value will be used
    diwakarIsFeeling("angry")
    diwakarIsFeeling("blessed")
    diwakarIsFeeling("unknown")
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