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

// #region classes
interface IGreeter {
    fun greet()
}

open class Greeter: IGreeter {
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
@Inject
class InjectedClass @Inject constructor() {
}
// #endregion


