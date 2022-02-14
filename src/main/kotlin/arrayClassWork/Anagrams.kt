package arrayClassWork

import java.util.*
fun main(args: Array<String>) {
    val word1 = "mother in law"
    val word2 = "mother in law"

    val result = anagram(word1, word2)
    println("Is $word1 and $word2 ? = $result")
}

fun anagram(word1: String, word2: String): Boolean{
   val anagram = Arrays.equals(word1.chars().sorted().toArray(), word2.chars().sorted().toArray())
    if(anagram) {
        return true
    }
    return false
}