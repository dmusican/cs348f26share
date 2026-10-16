package day2026_10_16

fun doit(f: (Int) -> Int ): Int {
    return f(3)
}

fun main() {
    val x = doit { thing -> thing + 1 }  // I made an anonymous function
    val y = doit { thing -> thing * 5 }
    println(x)
    println(y)
}