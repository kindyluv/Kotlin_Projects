package arrayClassWork

fun main(args: Array<String>) {
    val array1 = arrayOf<Int>(1, 2, 3)
    val array2 = arrayOf<Int>(4, 5, 6)
    
    arrayCopy(array1, array2)
}

fun arrayCopy(array: Array<Int>, array2: Array<Int>){
    val arrayOneLength = array.size
    val arrayTwoLength = array2.size

    val result = IntArray(arrayOneLength + arrayTwoLength)

    System.arraycopy(array, 0, result, 0, arrayOneLength)
    System.arraycopy(array2, 0, result, arrayOneLength, arrayTwoLength)

    println(result.contentToString())
}