class math{

    //user defined infix member function
    infix fun square(a: Int): Int{
        val num = a * a
        return num
    }
    infix fun addition(b: Int): Int{
        val numb = b + b
        return numb
    }
}

fun main(args: Array<String>){
    val m = math()
    val result = m square 3
    print("The square of a number is: "+ result)

    val add = math()
    val addResult = add addition 9
    println("\nThe addition of number is "+addResult)
}