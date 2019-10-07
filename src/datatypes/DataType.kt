package datatypes


val num: Number=1L;
val char: Char='D';

fun main() {
    println("checking data types");
    println("*****************")
    println("is Character "+isChar(char))
    println("is Byte "+isByte(num))
    println("is Short "+isShort(num))
    println("is Integer "+isInt(num))
    println("is Long "+isLong(num))
    println("is Float "+isFloat(num))
    println("is Double "+isDouble(num)+"\n")

//    Data type casting
    println("Data type casting")
    println("*****************")
    println("Cast Int to Byte: "+ num.toByte())
    println("Cast Long to Int:" + num.toInt())
    println("Cast float to double: "+ num.toDouble())
}

fun isChar(ch: Char): Boolean{
    return ch is Char;
}
fun isByte(number: Number): Boolean{
    return number is Byte;
}
fun isShort(number: Number): Boolean{
    return number is Short;
}
fun isInt(number: Number): Boolean{
    return number is Int;
}
fun isLong(number: Number): Boolean{
    return number is Long;
}
fun isFloat(number: Number): Boolean{
    return number is Float;
}
fun isDouble(number: Number): Boolean{
    return number is Double;
}