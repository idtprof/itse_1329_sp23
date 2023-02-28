package unit02

// Cookie Calories

fun main() {
    val COOKIES_PER_BAG = 40 // The number of cookies per bag
    val SERVINGS_PER_BAG = 10 // The number of servings per bag
    val CALORIES_PER_SERVING = 300 // The number of calories per serving

// Calculate the number of cookies per serving.
    val COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS_PER_BAG

// Calculate the number of calories per cookie.
    val CALORIES_PER_COOKIE = CALORIES_PER_SERVING / COOKIES_PER_SERVING

    var cookiesEaten = 0 // To hold the number of cookies eaten
    var totalCalories = 0 // To hold the total calories consumed

// Get the number of cookies eaten.
    print("Enter the number of cookies eaten: ")
    cookiesEaten = readLine()!!.toInt()

// Calculate the number of total calories consumed.
    totalCalories = cookiesEaten * CALORIES_PER_COOKIE

// Display the number of total calories consumed.
    println("Number of total calories consumed: $totalCalories")
}

// Pseudocode:
// 1. Declare constants for the number of cookies per bag, servings per bag, and calories per serving.
// 2. Calculate the number of cookies per serving and calories per cookie.
// 3. Declare variables to hold the number of cookies eaten and total calories consumed.
// 4. Ask the user to input the number of cookies eaten and store it in cookiesEaten.
// 5. Calculate the number of total calories consumed.
// 6. Display the number of total calories consumed.