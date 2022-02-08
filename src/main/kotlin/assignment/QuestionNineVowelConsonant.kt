fun main(args: Array<String>) {
    print("Enter an alphabet: ")
    var ch = readLine()!!
    println()

    var vowelConsonant = if (ch.equals('a') || ch.equals('e') || ch.equals('i') || ch.equals('o') || ch.equals('u')) "vowel" else "consonant"

    println("$ch is $vowelConsonant")

}