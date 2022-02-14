package arrayClassWork

fun main(args: Array<String>) {
    val word = "hello world"
    val result = reverseSentence(word)
    println(result)
}

fun reverseSentence(words: String): String {
      if (words.isEmpty())
        return words

    return reverseSentence(words.substring(1)) + words[0]
}