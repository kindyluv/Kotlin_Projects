package arrayClassWork

fun main(args: Array<String>) {

    val numbers = arrayOf<Int>(1,4,42,5,10,9,6)

    average(numbers)
}

fun average(array: Array<Int>){
    var sum: Int = 0
    var average: Double = 0.0

    for (i in array){
        sum += i

    }
    average = (sum / 2).toDouble()

    println("Average sum of $sum = $average")
}

