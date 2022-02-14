fun main(args: Array<String>) {
    var language = arrayOf("Ruby", "Kotlin", "Java", "Python")
    for(item in language.indices){
        if (item%2 == 0){
            println(language[item])
        }
    }
}