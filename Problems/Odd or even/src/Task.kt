import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    if (number % 2 == 0)
        println("EVEN")
    else
        println("ODD")
}