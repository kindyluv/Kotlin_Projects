fun main(args: Array<String>) {
    val numbers = intArrayOf(1,4,42,-3)
    if(4 in numbers){
        println("Numbers arrayClassWork.array contains 4.")
    }

    for(i in numbers){
        if(i == 4){
            println("Numbers arrayClassWork.array contains 4.")
        }

    }

    val a = intArrayOf(1,2,3,4,-1)
    println(a[1])
    a[1]=12
    println(a[1])
    val v: Int = a[2] + a[4]
    println(v)
    println()

    val cloudService = arrayOf<String>("Microsoft", "Amazon", "Google", "Heroku")
    println(cloudService[0])
    println(cloudService[3])

    println()

    println(cloudService.get(0))
    println(cloudService.get(3))

    println()

    cloudService.set(3, "Digital Ocean")
    println(cloudService.get(3))

    println()
    for (i in cloudService)println(i)

    println()
    println("Size of cloudService arrayClassWork.array: ${cloudService.size}")

    if ("Amazon" in cloudService)println("Amazon exists in cloudService") else println("Amazon doest not exist in cloudService")

}