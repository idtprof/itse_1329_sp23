package unit04

import java.util.Random

fun main(args: Array<String>) {

    // Constant for the maximum random number
    val MAX_NUMBER = 10

    // Variables
    var guess: Int       // To hold the user's guess
    var randNum: Int     // To hold a random number

    // Create a Random object.
    val rand = Random()

    // Generate a random number.
    randNum = rand.nextInt(MAX_NUMBER)

    // Get the user's guess.
    println("I'm thinking of a number.")
    print("Guess what it is: ")
    guess = readLine()!!.toInt()

    // Respond to the user's guess.
    while (guess != randNum) {
        if (guess < randNum) {
            println("No, that's too low.")
        } else if (guess > randNum) {
            println("Sorry, that's too high.")
        }
        // Get another guess.
        print("Guess again: ")
        guess = readLine()!!.toInt()
    }

    // Congratulate the user.
    println("Congratulations! You guessed it!")
    println("I was thinking of the number $randNum.")
}

// Pseudocode:
// Define a constant MAX_NUMBER as 10.
// Initialize variables guess and randNum.
// Create a Random object.
// Generate a random number between 0 (inclusive) and MAX_NUMBER (exclusive) and assign it to randNum.
// Prompt the user to guess the number and store the input into guess.
// While the guess is incorrect, if it is too low, print "No, that's too low." Otherwise, if it is too high, print "Sorry, that's too high."
// Prompt the user for another guess and store the input into guess.
// If the guess is correct, print "Congratulations! You guessed it!" and "I was thinking of the number" followed by the random number that was generated.
// End the program.