import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    if (a in b..c && b < c){
        println(true)
    }else
        print(false)
}
