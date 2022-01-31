fun main(args: Array<String>) {
    val numbers = intArrayOf(1,4,42,-3)
    if(4 in numbers){
        println("Numbers array contains 4.")
    }

    for(i in numbers){
        if(i == 4){
            println("Numbers array contains 4.")
        }
    }

    val a = intArrayOf(1,2,3,4,-1)
    println(a[1])
    a[1]=12
    println(a[1])
}