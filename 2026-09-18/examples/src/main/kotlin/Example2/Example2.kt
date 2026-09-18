package Example2

import kotlin.concurrent.thread

// involves a shared variable without protections
// which is BAD BAD BAD
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