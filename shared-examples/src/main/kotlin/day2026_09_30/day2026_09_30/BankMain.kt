package day2026_09_30.day2026_09_30

import kotlin.concurrent.thread
fun main() {
    val acct = Bank2(0)
    val numtimes = 100000
    val t1 = thread {
        for (i in 0..<numtimes) {
            acct.deposit(1)
            if (i % 10000 == 0) {
                println("${acct.balance} Thread 1")
            }
        }
    }
    val t2 = thread {
        for (i in 0..<numtimes) {
            acct.withdraw(1)
            if (i % 10000 == 0) {
                println("${acct.balance} Thread 2")
            }
        }
    }
    t1.join()
    t2.join()
    println("At end ${acct.balance}")
}
