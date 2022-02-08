fun main(args: Array<String>) {

    print("Enter an integer_1: ")
    var numberOne = readLine()!!.toInt()
    println()

    var answer = if(numberOne%2 == 0){
        println("You entered an even number")
        numberOne
    }else {
        println("You entered an odd number")
        numberOne
    }

    println("The number is = $answer")

}