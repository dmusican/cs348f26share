package day2026_09_30.day2026_09_30

class Bank1(var balance: Int) {

    fun withdraw(amt: Int) {
        balance -= amt
    }

    fun deposit(amt: Int) {
        balance += amt
    }
}
