package com.example.kotlin

// #region imports
import java.util.Random as Rand
import android.support.v7.app.AppCompatActivity
import org.amshove.kluent.`should equal`
// #endregion

// #region main
fun main(args: Array<String>) {
    println("Hello Kotlin!")
}
// #endregion

// #region variables
val items = listOf("apple", "banana", "kiwifruit")
var x = 9
const var CONSTANT = 99
// #endregion

// #region functions
fun foo() {
    val x  = Bar::class
    val y = hello?.test
}

suspend fun SequenceBuilder<Int>.yieldIfOdd(x: Int) {
    if (x % 2 != 0) yield(x)
}

abstract fun onCreate(savedInstanceState: Bundle?)

fun isOdd(x: Int) = x % 2 != 0
fun isOdd(s: String) = s == "brillig" || s == "slithy" || s == "tove"

val numbers = listOf(1, 2, 3)
println(numbers.filter(::isOdd))
// #endregion

// #region control
fun foo(node: Node): String? {
    val parent = node.getParent() ?: return null
}
// #endregion

// #region classes
interface Greetable {
    fun greet()
}

open class Greeter: Greetable {
    companion object {
        private const val GREETING = "Hello, World!"
    }
    
    override fun greet() {
        println(GREETING)
    }
}
// #endregion

// #region expect/actual
expect class Foo(bar: String) {
    fun frob()
}

actual class Foo actual constructor(val bar: String) {
    actual fun frob() {
        println("Frobbing the $bar")
    }
}

expect fun formatString(source: String, vararg args: Any): String
expect annotation class Test

actual fun formatString(source: String, vararg args: Any) = String.format(source, args)
actual typealias Test = org.junit.Test
// #endregion

// #region sealed-class
sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()
// #endregion

// #region annotation
@file:JvmName("Foo")
private sealed class InjectedClass @Inject constructor() {
    companion object {
        
    }
}
annotation class Suspendable
val f = @Suspendable { Fiber.sleep(10) }
// #endregion


