class Salary {
    var annual = 0.0
    fun giveRaise(percent: Double) {
        annual += annual*percent
    }
    fun getSalaryInEuros(): Double {
        return annual * 0.91
    }
}

fun main() {
    val pay = Salary()
    pay.annual = 100.0
    println("Salary is " + pay.annual)
    println("Euros is " + pay.getSalaryInEuros())
    println("Salary is " + pay.annual)
    pay.giveRaise(.10)
    println("Salary is " + pay.annual)
}