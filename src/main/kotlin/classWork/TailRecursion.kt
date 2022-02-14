fun main(args: Array<String>) {
    var number = 100000.toLong()
    var result = recursiveSum(number)
    println("sum of upto $number number = $result")
}
tailrec fun recursiveSum(n: Long, semiResult: Long = 0): Long{
    return if(n<=1){
        semiResult
    }else{
        recursiveSum((n -1), n + semiResult)
        }
}