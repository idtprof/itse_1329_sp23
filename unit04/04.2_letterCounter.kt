package unit04

import javax.swing.JOptionPane
fun main() {
    var input: String     // To hold keyboard input
    var output: String    // To hold the output
    var str: String       // The string to search
    var strUpper: String  // Uppercase equivalent of str
    var letter: Char      // The letter to count
    var num = 0           // Number of times the letter appears

    // Get a string from the user.
    str = JOptionPane.showInputDialog("Enter a string.") ?: ""

    // Get the uppercase equivalent of the string.
    strUpper = str.toUpperCase()

    // Get the letter to count.
    input = JOptionPane.showInputDialog(
        "Enter a letter contained in " +
                "the string.") ?: ""

    // Make sure the letter is uppercase.
    input = input.toUpperCase()

    // Retrieve the letter.
    letter = input[0]

    // Count the number of times the letter appears
    // in the string.
    for (i in strUpper.indices) {
        if (strUpper[i] == letter)
            num++
    }

    // Format and display the count.
    output = String.format("The letter %s " +
            "appears %d times in " +
            "the string: %s\n",
        letter, num, str)

    JOptionPane.showMessageDialog(null, output)

    System.exit(0)
}