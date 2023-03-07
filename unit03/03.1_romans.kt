package unit03

fun main() {
    var number: Int // To hold a number

    // Get a number from the user.
    print("Enter a number in the range of 1 - 10: ")
    number = readLine()!!.toInt()

    // Display the Roman numeral.
    when (number) {
        1 -> println("I")
        2 -> println("II")
        3 -> println("III")
        4 -> println("IV")
        5 -> println("V")
        6 -> println("VI")
        7 -> println("VII")
        8 -> println("VIII")
        9 -> println("IX")
        10 -> println("X")
        else -> println("Invalid number.")
    }
}
