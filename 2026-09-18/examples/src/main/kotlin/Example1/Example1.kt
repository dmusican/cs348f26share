
package Example1 // package for Dave so that multiple copies of function names are ok

class ExampleThread(var id: Int): Thread() {
    var answer = 0L
    override fun run() {
        var total = 0L
        for (j in 0..< 10000000000) {
            total += j
        }
        println("Total is $total and I am id $id")
        answer = total
    }
}

// Add a bunch of numbers
fun main () {
    for (i in 0..<2) {
        val myThread = ExampleThread(i)
        //myThread.run() // bad
        myThread.start()
        myThread.join()  // wait for thread to finish
        println("Result form myThread is ${myThread.answer}")
    }

}
