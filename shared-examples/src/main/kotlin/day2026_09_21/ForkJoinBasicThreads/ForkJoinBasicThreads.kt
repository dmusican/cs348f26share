package ForkJoinBasicThreads

fun isPrime(n: Int) : Boolean {
    for (i in 2..<n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}