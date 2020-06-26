# Coffee Machine
Coffee machine simulator

That's a project I've done while learning on [JetBrains Academy][hyperskill]

## Overview
The machine works with typical products: coffee, milk, sugar, and plastic cups; if it runs out of something, it shows a notification. You can get three types of coffee: espresso, cappuccino, and latte. Since nothing’s for free, it also collects the money.

```sh
Write action (buy, fill, take, remaining, exit): > remaining
 
The coffee machine has:
400 of water
540 of milk
120 of coffee beans
9 of disposable cups
$550 of money
 
Write action (buy, fill, take, remaining, exit): > buy
 
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > 2
I have enough resources, making you a coffee!
 
Write action (buy, fill, take, remaining, exit): > buy
 
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > 2
Sorry, not enough water!
 
Write action (buy, fill, take, remaining, exit): > fill
 
Write how many ml of water do you want to add: > 1000
Write how many ml of milk do you want to add: > 0
Write how many grams of coffee beans do you want to add: > 0
Write how many disposable cups of coffee do you want to add: > 0
 
Write action (buy, fill, take, remaining, exit): > take
 
I gave you $557
 
Write action (buy, fill, take, remaining, exit): > remaining
 
The coffee machine has:
1050 of water
465 of milk
100 of coffee beans
8 of disposable cups
$0 of money
 
Write action (buy, fill, take, remaining, exit): > exit
```

## Requirements
- Download [JDK][openjdk-14] and extract
- Add JDK `/bin` directory to your PATH

## Usage
- Download [release]
- Run where you placed `machine.jar`:
```sh
java -jar machine.jar
```
- Or you can run Kotlin class (see Build)
- Run in `/machine` parent directory:
```sh
kotlin machine.MainKt
```

## Build
- Install [Kotlin compiler][kotlinc], same as JDK (see requirements)
- Run the following from project directory


- To build artifact:
```sh
kotlinc src/machine/Main.kt -include-runtime -d out/artifacts/machine.jar
```
- To build Kotlin class:
```sh
kotlinc src/machine/Main.kt -d out/production/classes
```

[openjdk-14]: http://jdk.java.net/14/
[kotlinc]: https://github.com/JetBrains/kotlin/releases/latest
[hyperskill]: https://hyperskill.org/projects/67
[release]: https://github.com/mihael-stormrage/coffee-machine-kotlin/releases
