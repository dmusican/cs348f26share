class Salary {
    var annual = 0.0
    fun giveRaise(percent: Double) {
        annual += annual*percent
    }
    fun getSalaryInEuros(): Double {
        return annual * 0.91
    }
}