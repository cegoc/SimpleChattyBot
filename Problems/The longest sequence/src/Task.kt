import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var count = 0
    var maxCount = 0
    var current = 0

    repeat(n) {
        val x = scanner.nextInt()
        if (x >= current) {
            count++
        } else {
            count = 1
        }
        if (count > maxCount) maxCount = count
        current = x
    }

    println(maxCount)
}