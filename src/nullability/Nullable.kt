package nullability

fun main() {
    var firstName = "Diwakar" //this means firstName can not be null in any case
//    firstName = null; its a compilation error because name can't be NULL
    println("My first name is $firstName")

    var lastName:String? = "Mishra" //this lastName can be null
    println("My last name is $lastName")
//    lastName = null; //this is allowed because lastName can be NULL
//    println("My last name after  $lastName")

    var fullName = "$firstName  ${lastName?.subSequence(0,1)}" //(?.) safe operator before calling any methods of nullable string lastName
    println("SAFE operator: My full name is $fullName")

    fullName = "$firstName  ${lastName?.subSequence(0,1) ?:""}" //(?:) alvis operator used to provide else condition
    println("ALVIS operator: My full name is $fullName")

    //If we are 100% sure that value can't be null we can use !! to use methods on object
    var str:String? = "My name is Diwakar Mihra"
//    str=null;
    print("!! operator : ${str!!.length}") //force to call functions on a NULLABLE value because we are 100% sure its not null ERROR PRONE


}