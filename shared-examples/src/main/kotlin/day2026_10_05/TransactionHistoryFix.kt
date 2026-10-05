package day2026_10_05

import kotlin.concurrent.thread

// What does it take to fix this class to be threadsafe for all possible uses,
// not necessarily just the sample main that I provided?
// Write down the necessary changes.
class TransactionHistoryFix {
    private var history = mutableListOf<Int>()

    // same as synchronized(this) for all code in method
    @Synchronized
    fun add(value: Int) {
            history.add(value)
    }

    @Synchronized
    fun remove(value: Int) {
        history.remove(value)
    }

    @Synchronized
    fun getCurrentHistory(): List<Int> {
        // Double check i
        return history.toList()
    }
}

fun main() {
    // some sample usage only
    val th = TransactionHistoryFix()
    val t1 = thread {
        for (i in 0..<10000) {
            th.add(i)
        }
    }

    val t2 = thread {
        for (i in 50000..<60000) {
            th.add(i)
        }
    }
    t1.join()
    t2.join()

    println(th.getCurrentHistory().count())
}
