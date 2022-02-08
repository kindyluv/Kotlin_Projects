import java.util.Scanner;

fun main(args: Array<String>) {

    print("Enter a number: ")
    var read = Scanner(System.`in`)
    var num = read.nextInt()
    println()

    var factorial: Int = 1
    for (i in 1..num) {
        factorial = factorial * i;
        // factorial *= i.toInt()
    }
    println("Factorial of $num = $factorial")
}