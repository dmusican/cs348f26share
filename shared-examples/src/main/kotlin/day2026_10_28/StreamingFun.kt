package day2026_10_28
import java.util.stream.*

fun main() {
    val myList = mutableListOf<Int>()
    for (i in 0..<100) {
        myList.add(i)
    }

    myList.stream().forEach { print("$it ") }
    myList.stream().parallel().forEach { print("$it ") }
    println()
//    myList.stream().forEach { print("${it * it} ") }

    println()
    // Start with another example
    IntStream.range(0, 500)
        .filter { it % 2 == 0 }
        .forEach { print("$it ")}
}