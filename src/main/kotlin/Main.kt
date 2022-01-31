fun main(args: Array<String>) {
    var language = "French"
    val score = 95
    println(language)
    println(score)
    language = "English"
    println(language)
    println("Hello World!")

    //number comparism
    val num1: Int = 8
    val num2: Int = 9
    var sum: Int = 0
    for(i in num1..num2) {
        if(i == num1){
            println("ok")
        }
        sum += i
    }
    println(sum)




}