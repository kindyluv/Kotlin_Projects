fun main(args: Array<String>){
    var mutableList = mutableListOf("Apple", "Orange")
    mutableList.add("Banana")
    mutableList.add("Mango")

    var mutableList2 = mutableListOf<String>()
    mutableList2.add("Lion")
    mutableList2.add("Tiger")
    mutableList2.add("Wolf")
    for (i in mutableList) println(i)

    println()

    for(element in mutableList2) println(element)

    println()

    println(mutableList.dropLast(1))

    println()

    println(mutableList2.removeAt(1))

    println()

    for (rem in mutableList2) println(rem)
    
}