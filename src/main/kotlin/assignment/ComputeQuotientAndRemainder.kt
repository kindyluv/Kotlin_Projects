fun main(args: Array<String>){
    print("Enter an integer_1: ")
    var integerOne = readLine()!!.toInt()
    println()
    print("Enter an integer_2: ")
    var integerTwo = readLine()!!.toInt()
    println()

    var quotient = integerOne / integerTwo
    var remainder = integerOne % integerTwo
    println("The quotient of number one and number two = $quotient \n The quotient of number one and number two = $remainder")
}