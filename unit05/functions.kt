fun sayDay(){
    var day = 1

    for (i in 1..7) {
        if (day == 1) {
            println("It's Monday!")
        } else
        if (day == 2) {
            println("It's Tuesday!")
        }
    }
}

fun main(){
    sayDay()
    println("Hello World!")
}