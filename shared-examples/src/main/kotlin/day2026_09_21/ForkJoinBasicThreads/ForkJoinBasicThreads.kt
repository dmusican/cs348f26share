package ForkJoinBasicThreads

class PrimesThread(val arr: List<Int>, val low: Int, val high: Int): Thread() {
    val SEQUENTIAL_CUTOFF = 1000
    var answer = 0
    override fun run() {
        // Base case: small portion of the list
        if (high - low < SEQUENTIAL_CUTOFF) {
            for (i in low..<high) {
                if (isPrime(i)) {
                    answer++
                }
            }
        } else {
            val mid = (low + high)/2
            val left = PrimesThread(arr, low, mid)
            var right = PrimesThread(arr, mid, high)
            left.start()
            right.start()
            left.join()
            right.join()
            answer = left.answer + right.answer
        }
    }
}



fun isPrime(n: Int) : Boolean {
    for (i in 2..<n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun countPrimes(arr: List<Int>) : Int {
    val oneThread = PrimesThread(arr, 0, arr.count())
    oneThread.run()
    return oneThread.answer
}

fun main() {
    val nums = (1..1000000).toList().shuffled()
    println(countPrimes(nums))
}