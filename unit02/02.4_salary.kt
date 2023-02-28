package unit02

/**

This program demonstrates a solution to the
Name, Age, and Annual Income programming challenge.
 */
fun main() {
    var name: String // To hold a name
    var age: Int // To hold an age
    var annualPay: Double // To hold annualPay

// Store values in the variables.
    name = "Joe Mahoney"
    age = 26
    annualPay = 100000.0

// Display a message.
    println("My name is $name, my age is $age, and I hope to earn $$annualPay per year.")
}

// Pseudocode:
// 1. Declare variables to hold the name, age, and annual pay.
// 2. Store the name, age, and annual pay values in the corresponding variables.
// 3. Display a message that includes the name, age, and annual pay using string interpolation.