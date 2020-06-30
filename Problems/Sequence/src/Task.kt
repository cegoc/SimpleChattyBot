import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val c1 = scanner.next().single()
    var c2 = scanner.next().single()
    val c3 = scanner.next().single()

    val bc1 = c1 < c2
    val bc2 = c2 < c3
    val bc3 = ++c2 == c3
    println(bc1 && bc2 && bc3)
}

