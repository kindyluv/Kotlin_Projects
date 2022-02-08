fun main(args: Array<String>) {
    print("Enter first number: ")
    var numOne = readLine()!!.toInt()

    print("\nEnter second number: ")
    var numTwo = readLine()!!.toInt()

    print("\nEnter third number: ")
    var numThree = readLine()!!.toInt()

    print("\nEnter a fibonacci number: ")
    var numFour = readLine()!!.toInt()

    while (numFour>0){
        numThree = numOne + numTwo
        numOne = numTwo
        numTwo = numThree

        println(numThree)
        numFour--
    }

}