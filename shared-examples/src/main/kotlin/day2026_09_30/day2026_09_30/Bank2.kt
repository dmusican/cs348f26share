package day2026_09_30.day2026_09_30

class Bank2(var balance: Int) {

    fun withdraw(amt: Int) {
        synchronized(this) {
            balance -= amt
        }
    }

    fun deposit(amt: Int) {
        synchronized(this) {
            balance += amt
        }
    }
}
