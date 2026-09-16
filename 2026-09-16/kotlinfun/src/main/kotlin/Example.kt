class Salary(var employeeName: String?) {

    var annual: Double? = 0.0

    fun giveRaise(percent: Double) {
        if (annual == null) {
            // do nothing
        } else {
            annual += annual * percent
 //       }
    }
    fun getSalaryInEuros(): Double {
        return annual * 0.91
    }

    fun addXtoEnd() {
        employeeName = employeeName + "X"
    }
}

fun main() {
    val pay = Salary(null)
    pay.annual = 100.0
    println("Salary is " + pay.annual)
    //println("Euros is " + pay.getSalaryInEuros())
    println("Salary is " + pay.annual)
    pay.giveRaise(.10)
    println("Salary is " + pay.annual)
    //pay.addXtoEnd()
    println(pay.employeeName)

    var thing: Int? = null
    if (thing == null) {
        thing = 0
    } else {
        thing = thing + 1
    }
}