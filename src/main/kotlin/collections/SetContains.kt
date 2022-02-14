fun main(args: Array<String>) {
    val mySet: Set<Any> = setOf(2,6,4,29,5,"Lagos","Ogun", "Osun")
    val intSet = setOf(29, 6, 2, 5, 4, "Lagos", "Ogun")

    println(".......print Any set..........")
    for (i in mySet) println(i)

    println("...mySet.contains\"Lagos\"...") 
    println(mySet.contains("Lagos"))
    println("...mySet.contains(10)...") 
    println(mySet.contains(10))
    println("...mySet.containsAll(intSet)...")
    println(mySet.containsAll(intSet))

    for (i in mySet) println(i)

    val remainList = mySet.drop(4)
    println(".......print Set after mySet.drop(4)........")
    for (i in remainList) println(i)

    // mySet.removeAt(7)

    // for (i in )
}