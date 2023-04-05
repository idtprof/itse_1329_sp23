fun isNumberDivisible(number: Int, divisor: Int): Boolean {

    // Display the BMI and weight status
    println("BMI: %.1f".format(bmi))
    when {
        bmi < 18.5 -> println("Underweight")
        bmi <= 25 -> println("Optimal weight")
        else -> println("Overweight")
    }
}