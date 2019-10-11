package exceptions

import java.lang.Exception

fun main() {
    fun countChars(str:String?):Int{
        try {
            return str!!.length
        }catch (ex:Exception){
            println(ex)
        }finally {

        }
        return -1
    }

    var name:String? = "Diwakar Mishra"
    println("Char count of '$name' is ${countChars(name)}")
    name = null;
    println("Char count of '$name' is ${countChars(name)}")
}