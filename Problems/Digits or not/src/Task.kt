import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.next().single()
    val b = scanner.next().single()
    val c = scanner.next().single()
    val d = scanner.next().single()

    println("${a.isDigit()}\\${b.isDigit()}\\${c.isDigit()}\\${d.isDigit()}")
}