package arrayClassWork

fun main(args: Array<String>) {
    val numb = 12121
    val result = palindrome(numb)
    println(result)
}
fun palindrome(numb:Int): Boolean{
    var temp = numb
    var sum: Int = 0

    while (temp > 0){
        val result = temp % 10
        sum = sum * 10 + result
        temp /= 10
    }
    if (sum == numb) {
        return true
        
    }
    
    return false
}