import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 0

    for (i in 1..n) {
        val b = scanner.nextInt()
        if (a > b) {
            println("NO")
            return
        }
        a = b
    }
    println("YES")

}