package day2026_09_18.Example1


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
    val threadList = mutableListOf<ExampleThread>()
    for (i in 0..<20) {
        //myThread.run() // bad
        val myThread = ExampleThread(i)
        threadList.add(myThread)
        myThread.start()
    }
    for (t in threadList) {
        t.join()  // wait for thread to finish
        println("Result form myThread is ${t.answer}")
    }

}
k fs