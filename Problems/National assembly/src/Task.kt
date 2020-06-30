import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt().toDouble()
    println(Math.cbrt(value).toInt())
}