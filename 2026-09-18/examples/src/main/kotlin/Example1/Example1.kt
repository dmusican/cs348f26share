
package Example1 // package for Dave so that multiple copies of function names are ok

class ExampleThread(var id: Int): Thread() {
    override fun run() {
        var total = 0L
        for (j in 0..< 100000000) {
            total += j
        }
        println("Total is $total and I am id $id")
    }
}

// Add a bunch of numbers
fun main () {
    for (i in 0..<20) {
        val myThread = ExampleThread(i)
        myThread.run()
    }
}
