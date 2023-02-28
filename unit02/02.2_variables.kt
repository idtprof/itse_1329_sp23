package unit02

fun main() {
    // 1. Declare a constant called myAge and initialize it with my age.
    val myAge: Int = 25

    // 2. Declare a variable called averageAge and initialize it with the average of my age and 30.
    var averageAge: Double = (myAge + 30) / 2.0

    // 3. Create a constant called testNumber and initialize it with a value of your choice.
    // Create another constant called evenOdd and set it equal to testNumber modulo 2.
    // Change testNumber to various numbers and observe the value of evenOdd.
    val testNumber: Int = 7
    val evenOdd: Int = testNumber % 2
    // The value of evenOdd will always be 0 if testNumber is even, or 1 if it's odd.

    // 4. Create a variable called answer and perform some arithmetic operations on it.
    var answer: Int = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3 // Use right shift to divide by 8 (2^3)
    print(answer)
    // The final value of answer should be 1 + 10 = 11, times 10 = 110, divided by 8 = 13.
}

// Pseudocode:
// 1. Declare a constant called myAge and initialize it with your age.
// 2. Declare a variable called averageAge and initialize it with the average of your age and 30.
// 3. Create a constant called testNumber and initialize it with a value of your choice.
// Create another constant called evenOdd and set it equal to testNumber modulo 2.
// Change testNumber to various numbers and observe the value of evenOdd.
// 4. Create a variable called answer and initialize it with the value 0.
// Increment it by 1, add 10, multiply it by 10, and shift it to the right by 3.
// The final value of answer should be 13.