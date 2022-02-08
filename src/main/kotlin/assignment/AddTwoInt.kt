fun main(args: Array<String>) {
    print("Enter an integer_1: ")
    var integerOne = readLine()!!.toInt()
    println()
    print("Enter an integer_2: ")
    var integerTwo = readLine()!!.toInt()

    var sum = integerOne+integerTwo
    println("\nSum of numberOne + number is = $sum")
}