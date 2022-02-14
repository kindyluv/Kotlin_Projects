package arrayClassWork

fun main(args: Array<String>) {

    val number = 4

    val result: Int = recFactorial(number)
    println("Factorial of $number = $result")
}

fun recFactorial(n: Int): Int {
    return if (n == 1) n
        else n * recFactorial(n - 1)
}