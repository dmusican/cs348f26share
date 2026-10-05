package day2026_10_05// Manager: __________________________________


// Reader: _________________________________


// Recorder: _____________________________


// Reflector: _____________________________


// Why is this program subject to deadlock? Write down a schedule showing that
// this can happen. Then, propose a fix.
import kotlin.concurrent.thread

class BankAccount(var balance: Int) {

    @Synchronized                         // line A
    fun withdraw(amt: Int) {
        balance -= amt                    // line B
    }                                     // line C

    @Synchronized                         // line D
    fun deposit(amt: Int) {
        balance += amt;                   // line E
    }                                     // line F

    @Synchronized                                    // line G
    fun transferTo(amt: Int, other: BankAccount) {
        this.withdraw(amt)                           // line H
        other.deposit(amt)                           // line I
    }
}

fun main() {
    val one = BankAccount(1000)
    val two = BankAccount(2000)

    val t1 = thread {
        while (true) {
            println("1: About to transfer $500")
            one.transferTo(500,two)
            println("1: Transferred. Balance is ${one.balance}.")
        }
    }

    val t2 = thread {
        while (true) {
            println("  2: About to transfer $100")
            two.transferTo(100,one)
            println("  2: Transferred. Balance is ${two.balance}.")
        }
    }

    t1.start()
    t2.start()
}
