package unit02

// Star Pattern

fun main() {
    val rows = 7 // number of rows in the pattern
    val middleRow = rows / 2 // row number where the pattern reaches its maximum width

// loop over each row of the pattern
            for (row in 1..rows) {
                // calculate the number of stars to print in this row
                val stars = if (row <= middleRow) 2 * row - 1 else 2 * (rows - row) + 1
                // calculate the number of spaces to print before the stars
                val spaces = middleRow - (stars / 2)
                // print the spaces and stars for this row
                repeat(spaces) { print(" ") }
                repeat(stars) { print("*") }
                println()  // move to the next line
            }
}

// Pseudocode:
// 1. Define the number of rows in the pattern.
// 2. Calculate the row number where the pattern reaches its maximum width.
// 3. Loop over each row of the pattern:
// a. Calculate the number of stars to print in this row based on the current row number.
// b. Calculate the number of spaces to print before the stars.
// c. Print the spaces and stars for this row using the repeat() function.
// d. Move to the next line.




