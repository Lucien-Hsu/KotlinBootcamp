import java.lang.Math.random

fun main() {
    repeat(10){
        gamePlay(rollDice(6))
    }


    /*
    val random1 = random()
    print(" 1：$random1 ")
    print(" 1_2：$random1 \n")
    val random2 = {random()}
    print(" 2：${random2()}")
    print(" 2_2：${random2()}")
     */
}

var rollDice : (Int) -> Int = {
        face -> if(face == 0) 0 else random().times(face).toInt().plus(1)
}

fun gamePlay(rollDice : Int){
    println(rollDice)
}