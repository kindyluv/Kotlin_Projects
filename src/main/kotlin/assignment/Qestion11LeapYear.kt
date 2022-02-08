fun main(args: Array<String>) {
    print("Enter a year: ")
    var year = readLine()!!.toInt()
    println()

    when(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
        true -> println("Year is a leap year $year")
        else -> println("Year is not a leap year $year")
    }
    
    // var leap = if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
    //     println("This is a leap year $year")
    // }else{
    //     println("This is not a leap year $year")
    // }

    // var leap = false

    // if (year % 4 == 0) {
    //     if (year % 100 == 0) {
    //         leap = year % 400 == 0
    //     } else
    //         leap = true
    // } else
    //     leap = false

    // println(if (leap) "$year is a leap year." else "$year is not a leap year.")
}