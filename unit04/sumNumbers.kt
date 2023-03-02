package unit04

fun main() {
    var maxNum: Int // To hold the upper limit
    var num: Int // To hold a number
    var total = 0 // Accumulator

// Get a number from the user.
    print("Enter a positive nonzero number: ")
    maxNum = readLine()!!.toInt()

// Validate the number.
    while (maxNum <= 0) {
        print("Invalid. Enter a positive nonzero number: ")
        maxNum = readLine()!!.toInt()
    }

// Accumulate the sum of the numbers.
    num = 1 // The number series starts at 1.
    while (num <= maxNum) {
// Add num to total.
        total += num

                // Increment num.
                num++
    }

// Display the sum.
    println("The sum of all the integers from 1 through $maxNum is $total")
}

// Pseudocode:
// 1. Declare variables to hold the upper limit, a number, and an accumulator.
// 2. Ask the user to enter a positive nonzero number and store it in the maxNum variable.
// 3. Validate the number by prompting the user to enter a valid number if the input is less than or equal to zero.
// 4. Initialize the number series starting with 1 and accumulate the sum of the numbers by adding each number to the total variable and incrementing the number by 1.
// 5. Display the sum of the numbers.