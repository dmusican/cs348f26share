package day2026_10_05// Manager: __________________________________


// Reader: _________________________________


// Recorder: _____________________________


// Reflector: _____________________________


// Why is this program subject to deadlock? Write down a schedule showing that
// this can happen. Then, propose a fix.
import kotlin.concurrent.thread

class BankAccountFixed(var balance: Int, var id: Int) {

    @Synchronized                         // line A
    fun withdraw(amt: Int) {
        balance -= amt                    // line B
    }                                     // line C

    @Synchronized                         // line D
    fun deposit(amt: Int) {
        balance += amt;                   // line E
    }                                     // line F

    fun transferTo(amt: Int, other: BankAccountFixed) {
        if (this.id < other.id) {
            synchronized(this) {
                synchronized(other) {
                    this.withdraw(amt)
                    other.deposit(amt)
                }
            }
        } else {
            synchronized(other) {
                synchronized(this) {
                    this.withdraw(amt)
                    other.deposit(amt)
                }
            }
            
        }
    }
}

fun main() {
    val one = BankAccountFixed(1000, 1)
    val two = BankAccountFixed(2000, 2)

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
