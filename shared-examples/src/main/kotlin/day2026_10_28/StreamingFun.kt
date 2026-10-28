package day2026_10_28
import java.util.stream.*

fun main() {
    val myList = mutableListOf<Int>()
    for (i in 0..<100) {
        myList.add(i)
    }

    myList.stream().forEach { print("$it ") }
    println()
    myList.stream().forEach { print("${it * it}) ") }

}