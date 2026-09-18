package Example2

fun main() {
    var counter = 0
    for (i in 0..<20) {
        val myThread = thread {
            counter++
        }
    }
    println("Counter is $counter")
}