package machine

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    print("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has: ")
    val coffee = scanner.nextInt()
    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    val can = minOf(water / 200, milk / 50, coffee / 15)
    println(when {
        can > cups -> "Yes, I can make that amount of coffee (and even ${can - cups} more than that)"
        can < cups -> "No, I can make only $can cups of coffee"
        else -> "Yes, I can make that amount of coffee"
    })
}