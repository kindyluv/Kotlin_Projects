fun main(args: Array<String>) {
    print("Enter an integer_1: ")
    var numOne = readLine()!!.toInt()

    var numTwo: Int = 1
    var reversed = ""

    while (numOne != 0) {
        numTwo = numOne % 10
        reversed += numTwo
        numOne /= 10
    }

    println("Reversed Number: $reversed")

}