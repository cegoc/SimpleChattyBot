import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    if (number < 10 && number > 0)
        println("true")
    else
        println("false")
}