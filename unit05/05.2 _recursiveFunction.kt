package unit05

fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    } else if (number == 1 || number == 2) {
        return 1
    } else {
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
}

fun main() {
    // call the fibonacci function for numbers from 1 to 10 and print the result
    for (i in 1..10) {
        println("Fibonacci($i) = ${fibonacci(i)}")
    }
}
