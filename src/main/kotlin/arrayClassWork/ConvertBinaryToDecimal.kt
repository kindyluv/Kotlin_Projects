package arrayClassWork

import kotlin.math.pow

fun main(args: Array<String>) {
    val numb: Long = 110110111
    val decimal = binaryConversion(numb)
    println("$numb in binary = $decimal in decimal")

}

fun binaryConversion(numb: Long): Long{
    var num = numb
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
        ++i
    }
    return decimalNumber.toLong()
}