fun main(args: Array<String>) {
    print("Enter an alphapet: ")
    var character = readLine()!!
    println()

    if(character >="a" && character <= "z" || character >= "A" && character <= "Z") {
        println("$character is an alphabet")
    }else{
        println("$character is not an alphabet")
    }
}