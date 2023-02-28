package unit02

fun main() { // Declare a variable called friendsCount and ask the user to input the number of
    // friends they have
    print("How many friends do you have? ")
    val friendsCount: Int = readLine()!!.toInt()

    // Check if the user has more than 500 friends and print a message accordingly
    if (friendsCount > 500) {
        println("Adopt a Dog Today!")
    } else {
        println("Buy Cat Food At 20% Off")
    }
}
// Pseudocode:
// 1. Declare a variable called friendsCount.
// 2. Ask the user to input the number of friends they have and store it in friendsCount.
// 3. Check if friendsCount is greater than 500.
// 4. If friendsCount is greater than 500, print "Adopt a Dog Today!".
// 5. Otherwise, print "Buy Cat Food At 20% Off".
