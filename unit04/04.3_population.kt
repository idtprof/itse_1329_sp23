package unit04

fun main(){

// Define variables
var starting: Double
var increase: Double
var organisms: Double
var days: Int

// Get the starting number of organisms
print("Enter the starting number organisms: ")
starting = readLine()!!.toDouble()

// Validate the input
while (starting < 2) {
    print("Invalid. Must be at least 2. Re-enter: ")
    starting = readLine()!!.toDouble()
}

// Get the daily increase
print("Enter the daily increase: ")
increase = readLine()!!.toDouble()

// Validate the input
while (increase < 0) {
    print("Invalid. Enter a non-negative number: ")
    increase = readLine()!!.toDouble()
}

// Get the number of days to multiply
print("Enter the number of days the organisms will multiply: ")
days = readLine()!!.toInt()

// Validate the input
while (days < 1) {
    print("Invalid. Enter 1 or more: ")
    days = readLine()!!.toInt()
}

// Calculate and display the daily population
organisms = starting
println("Day\t\tOrganisms")
println("-----------------------------")

for (i in 1..days) {
    println("$i\t\t$organisms")
    organisms += (organisms * increase)
}
}