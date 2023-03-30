fun main() {
    print("Enter the wholesale cost: ")
    val wholesaleCost = readLine()!!.toDouble()

    print("Enter the markup percentage: ")
    val markupPercentage = readLine()!!.toDouble()

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)

    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupDecimal = markupPercentage / 100.0
    val retailPrice = wholesaleCost * (1 + markupDecimal)
    return retailPrice
}
