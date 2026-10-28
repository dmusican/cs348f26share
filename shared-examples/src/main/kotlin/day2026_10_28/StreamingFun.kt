package day2026_10_28
import java.util.stream.*
import kotlin.time.measureTime

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

    println("------")
    val thing = IntStream.range(0,500)
    val thing2 = thing.filter { it % 2 == 0 }
    thing2.forEach{ print("$it ")}
//    thing2.forEach{ print("$it ")}
    val result = IntStream.range(0, 500)
        .filter { it % 2 == 0 }
        .count()
    println(result)

    // Even more examples!
    var timeTaken = measureTime {
        val answer = IntStream.range(0, 10_000_000)
            .parallel()
            .mapToDouble { Math.sin(it.toDouble()) }
            .reduce { a,b -> a + b}
        println(answer)
    }

    println("Maybe something bad")
    // when done, total should contain the number of items in the list
    var total = 0
    val answer = IntStream.range(0, 10_000_000)
//        .parallel()
        .mapToDouble {
            val value = total
            total = value + 1
            Math.sin(it.toDouble())
        }
        .reduce { a,b -> a + b}
    println(total)


}