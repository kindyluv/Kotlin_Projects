fun main(args: Array<String>) {

    print("Enter an integer_1: ")
    var numOne = readLine()!!.toInt()
    println()

    print("Enter an integer_2: ")
    var numTwo = readLine()!!.toInt()
    println()

    print("Enter an integer_3: ")
    var numThree = readLine()!!.toInt()
    println()

    if(numOne > numTwo || numOne > numThree){
        println("number one is the greatest $numOne")
    }else if(numTwo > numThree || numTwo > numOne){
        println("number two is the greatest $numTwo")
    }else if(numThree > numTwo || numThree > numOne){
        println("number three is the greatest $numThree")
    }else{
        println("")
    }
    
}