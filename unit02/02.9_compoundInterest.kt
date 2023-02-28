package unit02

// Compound Interest problem

fun main() {
// Variables
    var amount: Double // Amount in the account
    var principal: Double // Principal originally deposited
    var rate: Double // Annual interest rate
    var compounding: Double // Number of times interest is compounded per year
    var years: Double // Number of years interest is compounded

// Get the necessary input.
    print("What is the original principal? ")
    principal = readLine()!!.toDouble()
    print("What is the annual interest rate? ")
    rate = readLine()!!.toDouble()
    print("How many times per year is interest compounded? ")
    compounding = readLine()!!.toDouble()
    print("For how many years will interest be compounded? ")
    years = readLine()!!.toDouble()

// Move the decimal point in the interest rate.
    rate /= 100.0

// Calculate the ending balance.
    amount = principal * Math.pow((1 + rate / compounding), (compounding * years))

// Display the result.
    println("After ${years.toInt()} years you will have $%.2f.".format(amount))
}

// Pseudocode:
// 1. Declare variables for the principal, interest rate, number of times compounded, and number of years.
// 2. Ask the user to input the necessary values and store them in the corresponding variables.
// 3. Convert the interest rate to a decimal.
// 4. Calculate the ending balance using the formula for compound interest.
// 5. Display the result.