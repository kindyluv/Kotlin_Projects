fun main(args: Array<String>) {
    val intSet = setOf(2,3,5,9,4,5)//sets int data type
    val mySet: Set<Any> = setOf(2,3,5,9,4,5, "Lagos", "Abeokuta")//sets any data type
    println("......print Int set.....")
    for (i in intSet) println(i)

    println("......print Any set.....")
    for (i in mySet) println(i)

}