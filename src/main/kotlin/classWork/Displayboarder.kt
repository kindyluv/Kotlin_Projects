fun displayBorders(character: Char = '=', length: Int=15) {
    for(i in 1..length){
        print(character)
    }

}

fun main(args: Array<String>) {
    println("Output when no argument is passed:")
    displayBorders()

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorders('*')

    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorders('*', 5)
    println()

    println("\n\n5 is used as a second argument the first character shud call itself.")
    displayBorders(length = 5)
    println()

    println("\n\n + sign is used as a first argument the second argument shud call itself.")
    displayBorders('+')
    println()
}