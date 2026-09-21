package ForkJoinBasicThreads

fun isPrime(n: Int) : Boolean {
    for (i in 2..<n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    val nums = (1..1000000).toList().shuffled()
    println(countPrimes(nums))
}