package arrayClassWork

fun main(args: Array<String>) {
    val words: String = "ertyuiopkjhgfdaqwlkmnbvcxz?!"
    val word: String = "r"
    val answer = pangram(word, words)
    println("result is = $answer")
}
fun pangram(element: String, wordsArray: String): Boolean{
    for (i in wordsArray){
        if(i in element) return true
    }
    return false
}