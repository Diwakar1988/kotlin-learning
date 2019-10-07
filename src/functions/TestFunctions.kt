package functions

fun main(args: Array<String>) {
    //Declared a simple function with no argument and return value
    fun sayHello(){
        println("Hello")
    }
    sayHello()

    //Declared a function with argument and no return value
    fun sayHello(greet:String){
        println("Hello $greet")
    }
    sayHello("Diwakar")

    //Declared a function with no argument and with return value
    fun getGreetings():String{
        return "Hello"
    }
    println(getGreetings())

    //Declared a function with argument and with return value
    fun getGreetings(name:String="Diwakar",extra:String):String{
        return "Hello $name $extra"
    }
    println(getGreetings("Mishra","Ji"))
}
