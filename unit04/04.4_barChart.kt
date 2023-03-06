package unit04

/**
This program demonstrates a solution to the
Bar Chart programming challenge.
 */

fun main() {
    var bar: String
    var numStars: Int
    var sales1: Double
    var sales2: Double
    var sales3: Double
    var sales4: Double
    var sales5: Double

    // Get the sales for store 1.
    print("Enter today's sales for store 1: ")
    sales1 = readLine()!!.toDouble()

    // Get the sales for store 2.
    print("Enter today's sales for store 2: ")
    sales2 = readLine()!!.toDouble()

    // Get the sales for store 3.
    print("Enter today's sales for store 3: ")
    sales3 = readLine()!!.toDouble()

    // Get the sales for store 4.
    print("Enter today's sales for store 4: ")
    sales4 = readLine()!!.toDouble()

    // Get the sales for store 5.
    print("Enter today's sales for store 5: ")
    sales5 = readLine()!!.toDouble()

    // Display the bar chart heading.
    println("\nSALES BAR CHART")

    // Display the chart for store 1.
    bar = ""
    numStars = (sales1 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    // Display the chart for store 2.
    bar = ""
    numStars = (sales2 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    // Display the chart for store 3.
    bar = ""
    numStars = (sales3 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    // Display the chart for store 4.
    bar = ""
    numStars = (sales4 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    // Display the chart for store 5.
    bar = ""
    numStars = (sales5 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)
}

// Pseudocode:
// Define the variables for the sales of 5 stores: sales1, sales2, sales3, sales4, and sales5.
// Prompt the user to enter today's sales for each store, and store the values in the corresponding variables.
// Print the header for the sales bar chart.
// Calculate the number of stars to display for each store by dividing the sales by 100 and converting the result to an integer.
// For each store, create a string variable named "bar" to hold the line in the bar chart, and use a loop to concatenate the appropriate number of "*" characters to the "bar" variable.
// Print the "bar" variable for each store to display the bar chart.