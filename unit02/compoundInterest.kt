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
