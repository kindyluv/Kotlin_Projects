fun main(args: Array<String>) {

    print("Enter a number: ")
    val num = readLine()!!.toInt()

    var sum: Int = 0
    for(i in 1.. num){
        sum += i
    }

    println("number sum: $sum")
}