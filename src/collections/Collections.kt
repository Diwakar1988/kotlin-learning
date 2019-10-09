package collections

/**
 * Kotlin is having number of collections array, map, list and set.
 * All set is having 2 types MUTABLE and IMMUTABLE
 */
fun main() {
    //immutable list
    var days = listOf<String>("Sun","Mon","Tue","Wed","Thu","Fri","Sat")
    println(days)

    //mutable list
    var movies = arrayListOf("Sunshine","Star Wars","Taken")
    println("Movies before = $movies")
    movies[0] = "Team-A"
    movies.add("Gi-Jo")
    movies.remove("Team-A")
    println("Movies after = $movies")

    var arr = arrayOf(1,2,3,4,5)
    println("array of positive sorted numbers $arr")

    //immutable map
    val mapOfDays = mapOf(0 to "Sun" , 1 to "Mon", 2 to "Tue", 3 to "Wed" , 4 to "Thu", 5 to "Fri" , 6 to "Sat")
    println("Map of days= $mapOfDays")

    //mutable map
    val mapOfMovies = hashMapOf(2005 to "Albeli" , 2006 to "Transformers")
    println("Map of movies before= $mapOfMovies")
    mapOfMovies.put(2007,"Yaariyan")
    mapOfMovies[2008] = "Gadar"
    println("Map of movies after= $mapOfMovies")

}