package unit03

fun main() {
    var month: Int // Variable to hold the month
    var day: Int // Variable to hold the day
    var year: Int // Variable to hold the year

// Get a month.
    print("Enter the number for a month: ")
    month = readLine()!!.toInt()

// Get a day.
    print("Enter the number for a day: ")
    day = readLine()!!.toInt()

// Get a two-digit year.
    print("Enter a two-digit year: ")
    year = readLine()!!.toInt()

// Is the date magic?
    if (month * day == year) {
        println("That date is magic!")
    } else {
        println("Sorry, that's just a regular date... not magic.")
    }
}

// Pseudocode:
// 1. Declare variables to hold the month, day, and year.
// 2. Ask the user to enter the number for a month and store it in the month variable.
// 3. Ask the user to enter the number for a day and store it in the day variable.
// 4. Ask the user to enter a two-digit year and store it in the year variable.
// 5. Determine whether the date is magic by multiplying the month and day and checking if the result is equal to the year. If it is, display "That date is magic!" Otherwise, display "Sorry, that's just a regular date... not magic.".