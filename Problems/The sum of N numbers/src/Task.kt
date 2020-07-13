import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var suma = 0

    repeat(n){
        val numbers = scanner.nextInt()
        suma += numbers
    }
    println(suma)
}