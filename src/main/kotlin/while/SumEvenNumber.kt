fun main(args: Array<String>){
    var num: Int = 10;
    var sum: Int = 0;
    while(num>=0){
        if(num%2==0){
            println("Even number"+ num*2)
        }else{
            println("odd number$num")
        }
        num--
    }
}