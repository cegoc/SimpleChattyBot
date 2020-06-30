import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var one = scanner.nextInt()
    var second = scanner.nextInt()
    var third = scanner.nextInt()

    if (one % 2 == 0) {
        one = one / 2
    } else {
        one = (one + 1) / 2
    }
    if (second % 2 == 0) {
        second = second / 2
    } else {
        second = (second + 1) / 2
    }
    if (third % 2 == 0) {
        third = third / 2
    } else {
        third = (third + 1) / 2
    }
    println(one + second + third)
}