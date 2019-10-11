package Lambda

import java.lang.Exception

fun log(message:String){
    println(message)
}
fun log(message:String?,callback:(success:Boolean)->Unit){
    try {
        println(message)
        callback(true)
    }catch (ex:Exception){
        callback(false);
    }
}
