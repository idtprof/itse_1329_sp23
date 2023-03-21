package unit03

/**
 * Restaurant Selector problem
 */
fun main() {
    // Variable to hold the user's response
    var response: String

    // Boolean flags for dietary restrictions
    var vegetarian = false
    var vegan = false
    var glutenFree = false

    // Display an introductory message.
    println("This program will help you select a restaurant.")

    // Any vegetarians?
    print("Is anyone in your party a vegetarian? (Enter yes or no): ")
    response = readLine().orEmpty()
    if (response == "yes") vegetarian = true

    // Any vegans?
    print("Is anyone in your party a vegan? (Enter yes or no): ")
    response = readLine().orEmpty()
    if (response == "yes") vegan = true

    // Anyone gluten free?
    print("Is anyone in your party gluten free? (Enter yes or no): ")
    response = readLine().orEmpty()
    if (response == "yes") glutenFree = true

    // Display the restaurant choices.
    println("Here are your restaurant choices:")
    if (!vegetarian && !vegan && !glutenFree) println("Joe's Gourmet Burgers")
    if (!vegan && !glutenFree) println("Mama's Fine Italian")
    if (!vegan) println("Main Street Pizza")

    // The following restaurants accommodate everyone.
    println("Corner Cafe")
    println("Chef's Kitchen")
}
