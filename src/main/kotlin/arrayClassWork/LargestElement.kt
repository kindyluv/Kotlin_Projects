package arrayClassWork

fun main(args: Array<String>) {

    val array = arrayOf<Int>(22,3,4,5,6,77)
    largestElement(array)
}

fun largestElement(element: Array<Int>){

    var largestElement = element[0]

    for(i in element){
        if(largestElement < i)
        largestElement = i
        
    }

    println("The Largest number of arrayClassWork.array element = $largestElement")
}