import java.util.Scanner


fun main(args: Array<String>) {
  
    val reader = Scanner(System.`in`)
    print("Enter any number except zero: ")
    var input: Int = reader.nextInt()

    println("You entered: $input")

    var sum: Int = 0

    while (input != 0) {
        if (input == 0) {
            break}
            else{
             sum += input;
            print("Enter any number and zero to exit: ");
            input = reader.nextInt();
        }
        println("Sum: $sum")
    }
}