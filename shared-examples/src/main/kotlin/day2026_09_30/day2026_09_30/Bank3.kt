package day2026_09_30.day2026_09_30

// Not finished, will come back
// In Kotlin, acct.balance really calls
// a built-in setter function
// we need to explicitly work with that
// setter function so we can put synchronized
// around it.
// Do that! HW have fun. Go at it.
// Will come back to
// Fixing acct.balance that happens in main
class Bank3(_balance: Int) {

    var balance = _balance
        set(value) {
            field = value
        }
        get() {
            return field
        }

    fun withdraw(amt: Int) {
        balance -= amt
    }

    fun deposit(amt: Int) {
        balance += amt
    }
}
