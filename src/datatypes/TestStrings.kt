package datatypes

fun main(args: Array<String>) {
    val escapedStrings = "hello kotlin \n ************** \n \"WOW\" \n" +
            " ************** \n"
    val rawString = """|My name is Diwakar Mishra
        |Principle software engineer @ make my trip
        |ACME team
        |
    """.trimMargin()
    val str1 = "Hello"
    val str2 = "World"
    val stringTemplate = "Hey, $str1 $str2"
    println("stringTemplate: $stringTemplate");
    println("escapedStrings: $escapedStrings");
    println("rawString: \n $rawString");

    /*****Some useful shorthands****/
    val firstName = "Diwakar"
    val lastName = "Mishra"
    val fullName = "$firstName $lastName"

    println("fullName = $fullName")
    println("$fullName name has ${fullName.length} chars")
    println("firstName.contentEquals(lastName) = "+firstName.contentEquals(lastName))
    println("fullName.contains(lastName) = "+fullName.contains(lastName))
    println("fullName.toUpperCase() = ${fullName.toUpperCase()}")
    println("fullName.subSequence(8,fullName.length) = "+fullName.subSequence(8,fullName.length))
    println("fullName.substring(8,fullName.length) = "+fullName.substring(8,fullName.length))
}