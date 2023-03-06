package unit04

import kotlin.random.Random
fun main() {
// Constant for the maximum random number
    val MAX_NUMBER = 10

// Variables
    var guess: Int // To hold the user's guess
    var randNum: Int // To hold a random number
    var count = 0 // To hold the count of guesses

// Create a Random object.
    val rand = Random

// Generate a random number.
    randNum = rand.nextInt(MAX_NUMBER)

// Get the user's guess.
    println("I'm thinking of a number.")
    print("Guess what it is: ")
    guess = readLine()!!.toInt()

// Set count to 1 because the user just made
// his or her first guess.
    count = 1

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

        // Increment the guess counter.
        count++
    }

// Congratulate the user.
    println("Congratulations! You guessed it!")
    println("I was thinking of the number $randNum.")
    println("You got it right in $count guesses.")
}

// Pseudocode:
// 1. Create a constant called MAX_NUMBER and set it to 10.
// 2. Create variables called guess, randNum, and count.
// 3. Generate a random number using the Random class.
// 4. Ask the user to guess the number and store it in the guess variable.
// 5. Initialize count to 1.
// 6. While guess is not equal to randNum, check if guess is less than or greater than randNum.
// 7. If guess is less than randNum, print "No, that's too low."
// 8. If guess is greater than randNum, print "Sorry, that's too high."
// 9. Ask the user to guess again and store it in the guess variable.
// 10. Increment the count variable by 1.
// 11. Congratulate the user and print the random number and number of guesses it took to guess the random number.