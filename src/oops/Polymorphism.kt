package oops

/**
 * Here we are learning polymorphism using function overloading and overriding
 */
open abstract class Vehicle(var make:String,var modal:String,var year:Int){
   abstract fun getCapacity(): Int
   open fun details(){
      println("'$modal' by '$make' of year $year")
   }
}
open class Truck(make:String,modal:String,year:Int,private val capacity:Int): Vehicle(make, modal, year) {
   override fun getCapacity(): Int {
      return capacity;
   }

   override fun details() {
      println("'$modal' by '$make' of year $year having sitting capacity ${getCapacity()} persons")
   }

   fun accelerate(){
      println("Increasing speed by 1000 rpm")
   }
   fun accelerate(rpm:Int = 1000){
      println("Increasing speed by $rpm rpm")
   }
   fun accelerate(rpm:Int = 1000, showRPM: Boolean=true){
      when(showRPM){
         true->println("Increasing speed by $rpm rpm")
         false->println("Increasing speed...")
      }
   }

}

fun main() {
   val truck207 = Truck("TATA","T207",2011,3);
   truck207.details();
   truck207.accelerate();
   truck207.accelerate(2000)
   truck207.accelerate(3000,false)
   truck207.accelerate(3000)
}