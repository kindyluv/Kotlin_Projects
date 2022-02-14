package arrayClassWork

fun main(args: Array<String>){
    val words: String = "precious"
    val result = removeVowelsFromString(words)
    println(result)
}
fun removeVowelsFromString(words: String){
    val vowel = "a, e, i, o, u"
    for (i in words){
        for (e in vowel){
            if (e == i) println(e)
        }
    }
}