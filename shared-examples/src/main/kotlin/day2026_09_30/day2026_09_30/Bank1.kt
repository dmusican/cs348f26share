package day2026_09_30.day2026_09_30

class Bank1(_balance: Int) {

    var balance = _balance
//        set(value) {
//            field = value
//        }
//        get() {
//            return field
//        }

    fun withdraw(amt: Int) {
        balance -= amt
    }

    fun deposit(amt: Int) {
        balance += amt
    }
}
