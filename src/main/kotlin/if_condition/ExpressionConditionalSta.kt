fun main(args: Array<String>) {
    val variable1: Int = -12;
    val variable2: Int = 12;

    val max = if(variable1<variable2){
        println("Variable2 is = $variable2 making variable2 the winner")
        variable2
    }else{
        println("Variable1 is = $variable1 making variable1 the winner")
        variable1
    }

    println("max = $max")
}