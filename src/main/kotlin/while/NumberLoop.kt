package `while`

fun main(args: Array<String>){
    var num: Int = 10;
    var sum: Int = 0;
    while(num>=5){
        println("Loop: $num")
        if(num % 2==0){
            sum +=num
        }
        num--
    }
    println("Sum: $sum")
}