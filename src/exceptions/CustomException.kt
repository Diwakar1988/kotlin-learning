package exceptions

import Lambda.log
import kotlin.Exception

open class CustomException(message:String):Exception(message){
    fun printMessage(){
        log(super.toString())
    }
}

fun main() {
    var name:String?="Diwakar Mishra"

    try {
        name=null
        println("Chars count in '$name' is ${name!!.length}");
    }catch (ex:Exception){
        throw CustomException(ex.toString());
    }
}