package interfaces

/**
 * Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
 * What makes them different from abstract classes is that interfaces cannot store state.
 * They can have properties but these need to be abstract or to provide accessor implementations.
 */
interface Named {
    val name: String
}

/**
 * A class or object can implement one or more interfaces
 * Interfaces Inheritance
 *An interface can derive from other interfaces and thus both provide implementations for their members and declare new functions and properties. Quite naturally,
 *classes implementing such an interface are only required to define the missing implementations:
 */
interface Person : Named {
    val firstName: String
    val lastName: String
    /**
     *Properties in Interfaces:
     *You can declare properties in interfaces. A property declared in an interface can either be abstract, or it can provide implementations for accessors.
     *Properties declared in interfaces can't have backing fields, and therefore accessors declared in interfaces can't reference them.
     */
    override val name: String get() = "$firstName $lastName"
}

internal open class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person{
    override fun toString(): String {
        return "$name is a $position"
    }
}

internal class MMTEmployee(firstName: String, lastName: String, position: String) :
    Employee(firstName, lastName, position) {
    override fun toString(): String {
        return super.toString()+ " @MakeMyTrip"
    }
}


fun main() {
    val emp = MMTEmployee("Diwakar", "Mishra", "Principal Engineer")
    println(emp)
}