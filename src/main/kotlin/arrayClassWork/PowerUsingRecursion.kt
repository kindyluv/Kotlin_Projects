package arrayClassWork

fun main(args: Array<String>) {
    val numb: Int = 6;
    val pow: Int = 2;
    val results = powerRecursion(numb, pow)
    println("number $numb raised to power $pow = $results")
}
tailrec fun powerRecursion(num: Int, power: Int): Int{
     if (power != 0)
        return num * powerRecursion(num, power - 1)
    else
        return 1
}