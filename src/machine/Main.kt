package machine

import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val coffeeMachine = CoffeeMachine()

    print("${coffeeMachine.state()}\n\nWrite action (buy, fill, take): ")
    when (scanner.next()) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
            coffeeMachine.buy(scanner.nextInt())
        }
        "fill" -> {
            print("Write how many ml of water do you want to add: ")
            val water = scanner.nextInt()
            print("Write how many ml of milk do you want to add: ")
            val milk = scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: ")
            val coffee = scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: ")
            val dispcups = scanner.nextInt()
            coffeeMachine.fill(water, milk, coffee, dispcups)
        }
        "take" -> {
            println("I gave you $${coffeeMachine.take()}")
        }
    }
    println("\n${coffeeMachine.state()}")
}

class CoffeeMachine(
        private var water: Int = 400,
        private var milk: Int = 540,
        private var coffee: Int = 120,
        private var dispcups: Int = 9,
        private var money: Int = 550) {

    fun state() = """The coffee machine has:
        |$water of water
        |$milk of milk
        |$coffee of coffee beans
        |$dispcups of disposable cups
        |$money of money""".trimMargin()

    fun buy(variety: Int) {
        when (variety) {
            1 -> { water -= 250; coffee -= 16; money += 4 }
            2 -> { water -= 350; milk -= 75; coffee -= 20; money += 7 }
            3 -> { water -= 200; milk -= 100; coffee -= 12; money += 6 }
        }
        dispcups -= 1
    }

    fun fill(_water: Int, _milk: Int, _coffee: Int, _dispcups: Int) {
        water += _water
        milk += _milk
        coffee += _coffee
        dispcups += _dispcups
    }

    fun take(): Int {
        val buffer = money
        money = 0
        return buffer
    }
}