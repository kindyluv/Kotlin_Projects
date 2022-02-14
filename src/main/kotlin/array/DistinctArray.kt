fun main(args: Array<String>) {
    val name = arrayOf<String>("Seyi","Tunde","Wunmi","Chuks","Becca","Tunde")

    val distinct = name.distinct()
    for(names in distinct) println(names)

    println()

    val result = name.dropLast(2)
    for (i in result) println(i)
    println()
    println("Confirm if name list is empty: "+name.isEmpty())
}