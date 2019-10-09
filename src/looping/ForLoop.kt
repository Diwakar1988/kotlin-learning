package looping

fun main() {
    println("************** printing numbers from array **************")
    var arr = arrayOf(1,2,3,4,5)
    for (num in arr){
        print("   $num  ")
    }
    println("\n************** printing numbers from array by index **************")
    for (index in arr.indices){
        print("   ${arr[index]}  ")
    }

    println("\n************** printing days from list **************")
    var days = listOf<String>("Sun","Mon","Tue","Wed","Thu","Fri","Sat")
    for (day in days){
        print("   $day  ")
    }

    println("\n************** printing movies from map **************")
    val mapOfMovies = hashMapOf(2005 to "Albeli" , 2006 to "Transformers")
    mapOfMovies.put(2007,"Yaariyan")
    mapOfMovies[2008] = "Gadar"
    for ((year, movie) in mapOfMovies){
        println("'$movie' released in $year ")
    }

    println("\n************** printing rage values in for **************")
    print("for (i in 1..5) print(i) = ")
    for (i in 1..5) print(i)
    println()
    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()
    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()
    print("for (i in 1..4 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()
    print("for (i in 4 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)
}