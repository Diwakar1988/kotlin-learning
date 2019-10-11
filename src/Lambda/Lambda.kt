package Lambda

import Lambda.downloader.downloadImage

/**
 * We can use Lambda exp/Functions literal to pass in  functions
 */
fun main() {
    //Lambda exp with argument no return value
    val log = { message: String ->
        println(message)
    }
    log("Hello Kotlin")

    //Lambda exp with argument and return value
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    log("Sum(10,10) = ${sum(10, 10)}")

    var request = downloadImage("http://fake.url.com", { error ->
        println("HTTP-> ERROR ${error}")
    }, { response ->
        println("HTTP-> RESPONSE ${response}")
    })
    println("HTTP-> GET ${request}")

}


