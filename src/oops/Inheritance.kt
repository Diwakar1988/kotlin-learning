package oops

open class Person (var name: String, var age: Int, val gender: String) {
    open fun printDetails() {
        println("$name is $age years old $gender")
    }

    fun walk() {
        println("$name is walking...")
    }
}

class Employee(name: String, age: Int, gender: String,var designation:String):Person(name,age,gender){

    override fun printDetails() {
        println("$name is $age years old $gender and working as $designation")
    }
}

fun main() {
    val manager = Employee("Mishra",31,"Male","Principal Engineer");
    manager.walk()
}