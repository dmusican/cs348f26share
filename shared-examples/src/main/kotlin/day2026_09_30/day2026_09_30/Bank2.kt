package day2026_09_30.day2026_09_30

class Bank2(var balance: Int) {
    private val bankLock = Any()  // big parent object

    fun withdraw(amt: Int) {
        synchronized(bankLock) {
            balance -= amt
        }
    }

    fun deposit(amt: Int) {
        synchronized(bankLock) {
            balance += amt
        }
    }
}
