fun main(args: Array<String>) {
     print("Enter number of multiplication table you want to create: ")
     var num = readLine()!!.toInt()
     println()

     print("Enter the lenght of time it shud multiply: ")
     var num2 = readLine()!!.toInt()
     println()

     for(i in 1..num){
          for(j in 1..num2){
               // println("$i * $j = " i * j)
               var sum: Int = i * j
               println("$i * $j = $sum")
          }
          println()
     }
}