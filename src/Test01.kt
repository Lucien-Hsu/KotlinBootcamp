import java.util.*

fun main(args: Array<String>) {
    //var temperature = 10
    //val message = "You are ${if (temperature > 50) "fried" else "safe"} fish"
    //println(message)

    greeting(args[0])
}

fun dayOfWeek() {
    println("What day is it today?")
    var tmp = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(tmp){
        1 -> println("mon")
        2 -> println("0tues")
        3 -> println("wend")
        4 -> println("thurs")
        5 -> println("fri")
        6 -> println("sat")
        7 -> println("sun")
        else -> println("XXX")
    }
}

fun greeting(oclock : String){
    println("${if(oclock.toInt() < 12)"Good Morning!" else "Good Night!" }")
}




