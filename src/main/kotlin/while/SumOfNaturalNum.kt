fun main(args: Array<String>) {
    var naturalNum: Int = 100;
    var sum: Int = 0;
    while (naturalNum>=1){
        if(naturalNum % 1==0) sum = sum + naturalNum
        naturalNum--
    }
    println(sum)
}