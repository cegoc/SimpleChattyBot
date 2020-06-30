import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val day = scanner.nextInt()
    var foodCost = scanner.nextInt()
    var flightCost = scanner.nextInt()
    var hotelCost = scanner.nextInt()
    var moneyRequied = 0

    foodCost = day * foodCost
    flightCost = flightCost * 2
    hotelCost = hotelCost * (day - 1)

    moneyRequied = foodCost + flightCost + hotelCost
    println(moneyRequied)
}