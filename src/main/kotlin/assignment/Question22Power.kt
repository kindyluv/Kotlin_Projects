fun main(args: Array<String>) {
    var num: Int = 5
    var pow: Int = 3
    var multiple = 1

    while (pow > 0){
        multiple *= num
        pow--
    }

    println("Sum: $multiple")
}