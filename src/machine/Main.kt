package machine

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    var water = 400
    var milk = 540
    var coffee = 120
    var dispcups = 9
    var money = 550
    fun state() = """The coffee machine has:
        |$water of water
        |$milk of milk
        |$coffee of coffee beans
        |$dispcups of disposable cups
        |$money of money""".trimMargin()

    print("${state()}\n\nWrite action (buy, fill, take): ")
    when (scanner.next()) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            when (scanner.nextInt()) {
                1 -> { water -= 250; coffee -= 16; money += 4 }
                2 -> { water -= 350; milk -= 75; coffee -= 20; money += 7 }
                3 -> { water -= 200; milk -= 100; coffee -= 12; money += 6 }
            }
            dispcups -= 1
        }
        "fill" -> {
            print("Write how many ml of water do you want to add: ")
            water += scanner.nextInt()
            print("Write how many ml of milk do you want to add: ")
            milk += scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: ")
            coffee += scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: ")
            dispcups += scanner.nextInt()
        }
        "take" -> {
            print("I gave you $$money")
            money = 0
        }
    }
    println("\n${state()}")
}