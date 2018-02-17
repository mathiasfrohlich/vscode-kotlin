package hello

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