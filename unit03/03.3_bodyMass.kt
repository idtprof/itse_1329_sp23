package unit03

fun main() {
    var weight: Double // The user's weight
    var height: Double // The user's height
    var bmi: Double // The user's BMI

    // Tell the user what the program will do.
    println("This program will calculate your body mass index, or BMI.")

    // Get the user's weight.
    print("Enter your weight, in pounds: ")
    weight = readLine()!!.toDouble()

    // Get the user's height.
    print("Enter your height, in inches: ")
    height = readLine()!!.toDouble()

    // Calculate the user's body mass index.
    bmi = weight * 703 / (height * height)

    // Display the user's BMI.
    println("Your body mass index (BMI) is $bmi")

    // Determine whether the user is underweight, overweight, or has optimal weight.
    if (bmi < 18.5) {
        println("You are underweight.")
    } else if (bmi > 25) {
        println("You are overweight.")
    } else {
        println("Your weight is optimal.")
    }
}

// Pseudocode:
// 1. Declare variables to hold the user's weight, height, and BMI.
// 2. Tell the user what the program will do.
// 3. Ask the user to enter their weight in pounds and store it in the weight variable.
// 4. Ask the user to enter their height in inches and store it in the height variable.
// 5. Calculate the user's body mass index using the formula: BMI = weight * 703 / (height *
// height).
// 6. Display the user's BMI.
// 7. Determine whether the user is underweight, overweight, or has optimal weight by comparing
// their BMI to the ranges of 18.5 for underweight, and 25 for overweight. Display the result.