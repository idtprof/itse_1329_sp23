fun celsius(fahr:Double): Double{
    return(5/9)*(fahr-32)
}
fun main() {
    println("Fahrenheit ... Celsius")
    for (fahr in 0..20) {
        println(fahr + " ... " + celsius(fahr.toDouble()))
    }

}