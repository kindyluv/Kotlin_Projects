fun main(args: Array<String>) {
    var mutableListInt: MutableList<Int> = mutableListOf<Int>()
    var mutableListString: MutableList<String> = mutableListOf<String>()
    var mutableListAny: MutableList<Any> = mutableListOf<Any>()

    mutableListInt.add(2)
    mutableListInt.add(4)
    mutableListInt.add(12)
    mutableListInt.add(3,15)//add element 15 at index 3 at

    mutableListString.add("Heroku")//add element to list mutableListString receives string data type
    mutableListString.add("Amazon")
    mutableListString.add("Azure")

    mutableListAny.add("Camry")//add element to list mutableListAny receives any data type
    mutableListAny.add(10)
    mutableListAny.add(2)
    mutableListAny.add("Venza")

    println(".....print Int type.....")
    for (i in mutableListInt) println(i)
    println()

     println(".....print String type.....")
    for (i in mutableListString) println(i)
    println()

     println(".....print Any type.....")
    for (i in mutableListAny) println(i)
    println()
}