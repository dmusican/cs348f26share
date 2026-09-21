package day2026_09_18.Example2


import kotlin.concurrent.thread

// involves a shared variable without protections
// which is BAD BAD BAD
// "thread" as we use here isn't the problem directly,
// but it doesn't give you a lot of tools for doing things
// right
fun main() {
    var counter = 0
    for (i in 0..<20) {
        val myThread = thread {
            // Dave will force mayhem
            val updatedCounter = counter + 1
            counter = updatedCounter
        }
    }
    println("Counter is $counter")
}
