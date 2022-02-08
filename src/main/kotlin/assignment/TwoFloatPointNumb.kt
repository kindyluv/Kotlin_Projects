fun main(args: Array<String>) {
    print("Enter an decimal number_1: ")
    var integerOne = readLine()!!.toFloat()
    println()
    print("Enter an decimal number_2: ")
    var integerTwo = readLine()!!.toFloat()

    var sum = integerOne*integerTwo
    println("\n"+"Sum of numberOne + number is = $sum")
}