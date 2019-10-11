package oops

/**
 * All kotlin classes are final by default i.e. you can't inherit them.
 * By default kotlin creates getter and setters of a var type fields and only getters of const/val fields
 */
class VehicleV1{ //this is one way of declaring default constructor
    var make:String="";
    var modal:String="";
    var year:Int=0;
    val capacity=5;
    fun printDetails(){
        println("V1: '$modal' by '$make' of year $year")
    }
}
class VehicleV2(){ //this is another way of declaring default constructor
    var make:String="";
    var modal:String="";
    var year:Int=0;
    val capacity=5;
    fun printDetails(){
        println("V2: '$modal' by '$make' of year $year")
    }
}
class VehicleV3 constructor(){ //this is another way of declaring default constructor
    var make:String="";
    var modal:String="";
    var year:Int=0;
    val capacity=5;
    fun printDetails(){
        println("V3: '$modal' by '$make' of year $year")
    }
}

class VehicleV4 constructor(make:String,modal:String,year:Int){ //this is another way of declaring constructor and class variables
    var make=make
    var modal=modal
    var year=year
    val capacity=5;
    fun printDetails(){
        println("V4: '$modal' by '$make' of year $year")
    }
}

class VehicleV5 constructor(var make:String,var modal:String,var year:Int){ //this is another way of declaring constructor and class variables
    val capacity=5;
    fun printDetails(){
        println("V5: '$modal' by '$make' of year $year")
    }
}
class VehicleV6 (var make:String,var modal:String,var year:Int){ //this is another way of declaring constructor and class variables
    val capacity=5;
    fun printDetails(){
        println("V6: '$modal' by '$make' of year $year")
    }
}

fun main() {
    println("*************** printing all variation of class declaration ****************")

    println("\n*************** classes without / default constructor ****************")
    val i20 =VehicleV1();
    i20.make = "Hyundai"
    i20.modal = "i20 Elite"
    i20.year = 2014;
    i20.printDetails();

    val i30 =VehicleV2();
    i30.make = "Hyundai"
    i30.modal = "i30 Elite"
    i30.year = 2017;
    i30.printDetails();

    val i40 =VehicleV3();
    i40.make = "Hyundai"
    i40.modal = "i40 Elite"
    i40.year = 2017;
    i40.printDetails();

    println("\n*************** classes with constructor ****************")

    val i50 = VehicleV4("Hyndai","i50",2018);
    i50.printDetails();

    val i60 = VehicleV5("Hyndai","i60",2019);
    i60.printDetails();

    val i70 = VehicleV6("Hyndai","i70",2019);
    i70.printDetails();
}