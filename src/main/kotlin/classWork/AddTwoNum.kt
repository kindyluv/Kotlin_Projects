fun addTwoNumbers(){
    var num: Int = 10
    var num2: Int = 20

    var sum: Int = num + num2
    println("Sum: $sum")
}

fun addTwoNumbersTwo(numOne: Int, numTwo: Int): Int{

    var sum: Int = 0
    sum = numOne + numTwo
    return sum
}

fun main(args: Array<String>){
    addTwoNumbers()
    var numO = 4
    var numT = 80

    var result: Int
    result = addTwoNumbersTwo(numO, numT)

    println(result)
}