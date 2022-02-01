fun main(args: Array<String>) {
    val number: Int = -10
    val result = if (number > 0)"Positive number" else "Negative number"
    println(result)

    val a = -9
    val b = -11
    val max = if(a>b){
        println("$a is larger than $b.")
        println("max variable holds values of a")
        a
    }else{
        println("$b is larger than $a.")
        println("max variable holds values of b")
        b
    }
    println("max = $max")

}

