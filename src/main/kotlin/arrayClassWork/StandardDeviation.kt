package arrayClassWork

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val element = arrayOf<Double>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
    val sd = standardDeviation(element)

    println("Standard Deviation = $sd")
}
fun standardDeviation(numArray: Array<Double>): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / 10

    for (num in numArray) {
        standardDeviation += (num - mean).pow(2.0)
    }

    return sqrt(standardDeviation / 10)
}