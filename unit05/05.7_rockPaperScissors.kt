import kotlin.random.Random

fun main() {
    var playAgain = true

    while (playAgain) {
        println("Do you want to play Rock-Paper-Scissors? (y/n)")
        val wantsToPlay = readLine()?.toLowerCase() == "y"

        if (wantsToPlay) {
            println("These are the rules of the game:")
            println("Rock is r")
            println("Paper is p")
            println("Scissors is s")

            println("What's your answer?")
            val playerAnswer = readLine()?.toLowerCase()

            val cpuAnswer = when (Random.nextInt(1, 4)) {
                1 -> "r"
                2 -> "p"
                else -> "s"
            }

            println("Computer answer: $cpuAnswer")

            when {
                (playerAnswer == "r" && cpuAnswer == "s") ||
                        (playerAnswer == "p" && cpuAnswer == "r") ||
                        (playerAnswer == "s" && cpuAnswer == "p") -> {
                    println("You win!")
                }
                (playerAnswer == "r" && cpuAnswer == "p") ||
                        (playerAnswer == "p" && cpuAnswer == "s") ||
                        (playerAnswer == "s" && cpuAnswer == "r") -> {
                    println("You lose!")
                }
                (playerAnswer == cpuAnswer) -> {
                    println("Tie!")
                }
                else -> {
                    println("Invalid answer")
                }
            }
        }

        println("Do you want to play again? (y/n)")
        playAgain = readLine()?.toLowerCase() == "y"
    }
}
