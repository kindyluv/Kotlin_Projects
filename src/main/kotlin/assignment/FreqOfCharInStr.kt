fun main(args: Array<String>) {

    print("Enter a sentence: ")
    var str = readLine()!!.toString()

    print("Enter a word to check the frequency in the sentence: ")
    var ch = readLine()!!

    var sum: Int = 0
    
    var frequency = 0

    for (i in 0..(str.length - 1)) {
        if (ch.equals(str[i].toString())) {
            // sum += i
            frequency++
        }
    }

    println("Frequency of $ch = $frequency")
}