package org.jetbrains.foo

expect class Foo(bar: String) {
    fun frob()
}

fun main(args: Array<String>) {
    Foo("Hello").frob()
}

actual class Foo actual constructor(val bar: String) {
    actual fun frob() {
        println("Frobbing the $bar")
    }
}

expect fun formatString(source: String, vararg args: Any): String

expect annotation class Test

// JVM
actual fun formatString(source: String, vararg args: Any) =
    String.format(source, args)
    
actual typealias Test = org.junit.Test