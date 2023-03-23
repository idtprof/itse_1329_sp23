package unit05

fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    return (number % divisor == 0)
}
fun isPrime(number: Int): Boolean {
    var numIsPrime = true
    if (number > 0){
        for(i in 2..(number / 2))
            if (isNumberDivisible(number, i))
                numIsPrime = false
    }
}
fun main(){
    println(isPrime(6))
    isPrime(13)
    isPrime(8893)
}