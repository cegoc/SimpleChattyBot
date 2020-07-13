import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    repeat(n) {
        val parts = scanner.nextInt()

        if (parts == 0) {
            a++
        }
        if (parts > 0) {
            b++
        }
        if (parts < 0) {
            c++
        }
    }
    println("$a $b $c")
}