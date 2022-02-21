package arrayClassWork

fun main(args: Array<String>) {
    val jl: Int = 2
    val kl: Int = 11
    val ll: Int = 4

    when(jl >= kl && jl >= ll) {
         true -> println("$jl is the largest number.")
        false -> println("$kl is the largest number.")
        else -> println("$ll is the largest number.")
    }
//    val result = largestSum(jl, kl, ll)
//    println("$result is the largest number among three numbers")
}
//fun largestSum(j: Int, k: Int, l: Int): Int{
//    if (j > k && j > l) return j
//    else if (k > j && k > l) return k
//    else if (l > j && l > k) return l
//    return 0
//}