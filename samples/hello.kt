package hello

import android.support.v7.app.AppCompatActivity
import org.amshove.kluent.`should equal`

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

fun main(args: Array<String>) {
   Greeter().greet()
}