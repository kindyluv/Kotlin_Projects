package arrayClassWork

fun main(args: Array<String>) {
    val numb = 100;
    val result = naturalNumRecursion(numb);

    println(result);
}
tailrec fun naturalNumRecursion(n: Int, result: Int = 0): Int{
    return if (n <= 1){
        result;
    }else{
        naturalNumRecursion((n-1), n+result);
    }

}