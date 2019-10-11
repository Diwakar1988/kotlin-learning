/**
 * The declarations marked with the protected modifier are visible inside the file containing the declaration and subclasses. This modifier is not allowed for top-level declarations.
 */
package oops.access_modifiers.protected_as

import oops.access_modifiers.internal_as.height

internal open class Logger{
    protected open fun debug(message: String): Unit {
        println(message+ height)
    }
}
internal class Printer: Logger() {
    override public fun debug(message: String) {
        super.debug(message)
    }
}

fun main() {
    Printer().debug("My name is Diwakar")
}