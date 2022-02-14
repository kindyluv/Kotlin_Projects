package arrayClassWork

fun main(args: Array<String>) {
    val numbers = arrayOf<Int>(1,4,42,5,10,9,6)
    val value = 42
    val result = array(numbers, value);
    println(result);
}

fun array(array : Array<Int>, value: Int): Boolean{
    for (i in array){
        if (value == i){
        println("$i is the guess value")    
        return true;
        }
        
    }
    return false;
}