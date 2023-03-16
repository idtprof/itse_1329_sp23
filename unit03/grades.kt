fun main() {


    val weight: Int
    val height: Int
    val bmi: Double


    print("Enter your weight (in pounds): ")
    weight = 140
    print("Enter your height (in inches): ")
    height = 5


    bmi = (weight * 703 / (height * height)).toDouble()


    if (bmi < 18.5) {
        println("You are underweight")
    } else if (bmi > 25) {
        println("You are overweight")
    } else {
        println("You are just right")
    }


    println("Your bmi is:$bmi")
}