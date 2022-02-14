fun main(args: Array<String>) {
    val number = 4
    val result: Long

    result = tailRecFactorial(number)
    println("Factorial of $number = $result")

}
tailrec fun tailRecFactorial(n: Int, run: Int = 1): Long{
    return if (n == 1) run.toLong()
        else n*tailRecFactorial(n - 1, run * n)
}