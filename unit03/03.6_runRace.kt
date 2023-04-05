package unit03


/**
 * This program demonstrates a solution to the
 * Running the Race programming challenge.
 */
fun main() {
    var runner1: String      // First runner's name
    var runner2: String      // Second runner's name
    var runner3: String      // Third runner's name
    var firstPlace: String   // Name of first place runner
    var secondPlace: String  // Name of second place runner
    var thirdPlace: String   // Name of third place runner

    var time1: Double        // First runner's time
    var time2: Double        // Second runner's time
    var time3: Double        // Third runner's time

    // Display intro.
    println("This program displays the first, second, and third")
    println("place runners in a race.")
    println("No ties, please.")

    // Get the first runner's data.
    print("Enter the first runner's name: ")
    runner1 = readLine()!!
    print("Enter the first runner's time: ")
    time1 = readLine()!!.toDouble()

    // Get the second runner's data.
    print("Enter the second runner's name: ")
    runner2 = readLine()!!
    print("Enter the second runner's time: ")
    time2 = readLine()!!.toDouble()

    // Get the third runner's data.
    print("Enter the third runner's name: ")
    runner3 = readLine()!!
    print("Enter the third runner's time: ")
    time3 = readLine()!!.toDouble()

    // Determine the first place runner.
    firstPlace = if (time1 < time2 && time1 < time3) {
        runner1
    } else if (time2 < time1 && time2 < time3) {
        runner2
    } else {
        runner3
    }

    // Determine the second place runner.
    secondPlace = if (time1 < time2 && time1 > time3 || time1 < time3 && time1 > time2) {
        runner1
    } else if (time2 < time1 && time2 > time3 || time2 < time3 && time2 > time1) {
        runner2
    } else {
        runner3
    }

    // Determine the third place runner.
    thirdPlace = if (time1 > time2 && time1 > time3) {
        runner1
    } else if (time2 > time1 && time2 > time3) {
        runner2
    } else {
        runner3
    }

    // Display the results.
    println("1st place: $firstPlace")
    println("2nd place: $secondPlace")
    println("3rd place: $thirdPlace")
}
