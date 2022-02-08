fun main(args: Array<String>) {
    print("Enter an integer_1: ")
    var integerOne = readLine()!!.toInt()
    println()
    print("Enter an integer_2: ")
    var integerTwo = readLine()!!.toInt()
    println()

    var temp: Int = 0
    temp = integerOne
    integerOne = integerTwo
    integerTwo = temp

    println("number one $integerOne \nnumber two $integerTwo")
}