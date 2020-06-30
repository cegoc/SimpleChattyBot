import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val char = scanner.next().single()

    println(char.isUpperCase() || char in '\u0031'..'\u0039')
}