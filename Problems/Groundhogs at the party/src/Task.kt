import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val cups = scanner.nextInt()
    val weekend = scanner.nextBoolean()

   if (cups in 10..20 && weekend == false){
       println(true)
   }else if (cups in 15..25 && weekend == true) {
       println(true)
   }else{
       print(false)
   }
}