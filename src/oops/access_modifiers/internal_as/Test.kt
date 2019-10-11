/**
 * The declarations marked with the internal modifier are visible everywhere in the same module.
A module is a set of Kotlin files compiled together:
an IntelliJ IDEA module;
a Maven project;
a Gradle source set (with the exception that the test source set can access the internal declarations of main);
a set of files compiled with one invocation of the <kotlinc> Ant task.
 */
package oops.access_modifiers.internal_as

internal var height:Int=10;