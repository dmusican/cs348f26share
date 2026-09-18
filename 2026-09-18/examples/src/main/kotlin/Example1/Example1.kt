
package Example1 // package for Dave so that multiple copies of function names are ok

// Add a bunch of numbers
fun main () {
    var total = 0L
    for (j in 0..< 100000000) {
        total += j
    }
    println("Total is $total")
}
