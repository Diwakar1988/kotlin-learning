package Lambda.downloader

import java.lang.Exception

//only class declarations
class Error(val code:Int, val message:String)

class Request(val imageUrl:String, val headers:Map<String,String>?){
    fun execute(): Response {
        return Response(200, "dummy Image data downloaded")
    }
    override fun toString(): String {
        return "url=$imageUrl , $headers"
    }
}

class Response(val code:Int, val body:String){
    override fun toString(): String {
        return body
    }
}
//Unit is like void in JAVA i.e. no return value
fun downloadImage(imageUrl:String, onError: (Error)->Unit, onSuccess:(Response)->Unit): Request {
    val request= Request(imageUrl, null)
    try {
        request.headers!!.size
        val response = request.execute();
        onSuccess(response)
    }catch (error:Exception){
        val er = Error(1, error.toString());
        onError(er)
    }
    return request;
}