fun main(args: Array<String>) {

    var name = listOf(1,2,3,"Jane","John","Jude")
    var name2 = arrayOf<String>("Jane","John","Jude")

    println("Size: ${size(name)}")

    println("Size 2: ${arraySize(name2)}")


}

fun <T> size(array: List<T>): Int{
    return array.size
}

fun <T> arraySize(arrays: Array<T>): Int {
    return arrays.size
}