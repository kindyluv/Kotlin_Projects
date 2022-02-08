fun main(args: Array<String>) {
    print("Enter an integer_1: ")
    var numOne = readLine()!!.toInt()
    println()

    var sum: Int = 0;

    for(i in 1..numOne){
        sum += i
        // i++;
    }
    println("Sum: $sum")

}