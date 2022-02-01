fun main(args: Array<String>) {
    var ch='A'
    when(ch){
        'A'-> println("A is a Vowel")
        'E'-> println("E is a Vowel")
        'I'-> println("I is a Vowel")
        'O'-> println("O is a Vowel")
        'U'-> println("U is a Vowel")
        else-> println("$ch is a Consonant")
    }
    var sh='A'
    when (sh){
        'A','E','I','O','U'-> println("$sh is a vowel")
        else-> println("$sh is a consonant")
    }
}