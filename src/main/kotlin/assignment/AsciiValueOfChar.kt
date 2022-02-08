fun main(args: Array<String>) {
    print("Enter an alphabet: ")
    var character = readLine()!!.single()
    println()

    var ascii = character.toInt()

    println("The ASCII value of $character is = $ascii")
}