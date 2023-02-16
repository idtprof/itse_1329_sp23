fun main() {
    println("Enter a number between 1 and 10:")
    val input = readLine()?.toInt()

    if (input != null && input in 1..10) {
        val romanNumeral = when (input) {
            1 -> "I"
            2 -> "II"
            3 -> "III"
            4 -> "IV"
            5 -> "V"
            6 -> "VI"
            7 -> "VII"
            8 -> "VIII"
            9 -> "IX"
            10 -> "X"
            else -> ""
        }
        println("Roman numeral: $romanNumeral")
    } else {
        println("Error: Input must be between 1 and 10.")
    }
}