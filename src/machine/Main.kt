package machine

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()
    val water = cups * 200
    val milk = cups * 50
    val coffee = cups * 15
    println("""For $cups of coffee you will need:
        |$water ml of water
        |$milk ml of milk
        |$coffee g of coffee beans""".trimMargin())
}
