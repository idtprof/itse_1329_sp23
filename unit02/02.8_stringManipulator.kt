package unit02

// String Manipulator

fun main() {
    var city: String // To hold user input

// Ask the user to enter the name of their favorite city.
    print("Enter the name of your favorite city: ")
    city = readLine()!!

// Display the number of characters in the city name.
    println("Number of characters: ${city.length}")

// Display the city name in uppercase characters.
    println(city.toUpperCase())

// Display the city name in lowercase characters.
    println(city.toLowerCase())

// Display the first character in the city name.
    println(city[0])
}

// Pseudocode:
// 1. Declare a variable to hold user input.
// 2. Ask the user to enter the name of their favorite city and store it in the city variable.
// 3. Display the number of characters in the city name using the length() method.
// 4. Display the city name in uppercase characters using the toUpperCase() method.
// 5. Display the city name in lowercase characters using the toLowerCase() method.
// 6. Display the first character in the city name using the charAt() method. In Kotlin, this can be done more simply by accessing the character at index 0 of the string.
