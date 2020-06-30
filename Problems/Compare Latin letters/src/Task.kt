import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val letter1 = scanner.next().toUpperCase()
    val letter2 = scanner.next().toUpperCase()

    if (letter1 == letter2)
        println(true)
    else
        println(false)
}