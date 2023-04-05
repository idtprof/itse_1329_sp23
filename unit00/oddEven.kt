fun main() {
    print("Enter a number: ")
    val input = readLine()
    val number = input?.toInt() ?: 0
    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}