fun main(args: Array<String>) {
    var fortune: String =""

    //swim("low")

    /*
    //增加魚
    canAddFish(10.0, listOf(3,3,3))
    println("=================")
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    println("=================")
    canAddFish(9.0, listOf(1,1,3), 3)
    println("=================")
    canAddFish(10.0, listOf(), 7, true)
    println("=================")
*/
    //幸運
    while(!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")

    }

}

fun canAddFish(
    tankSize : Double,
    currentFish : List<Int>,
    fishSize : Int = 2,
    hasDecorations : Boolean = true
) : Boolean{
    var space = when(hasDecorations){
        true -> tankSize.times(0.8)
        else -> tankSize.toDouble()
    }

    var allFishLength = 0.0
    for((i, value) in currentFish.withIndex()){
        allFishLength += (value.toDouble())
    }
    allFishLength += (fishSize)

    var canAddFish : Boolean = space >= allFishLength
    println("canAddFish=$canAddFish allFishLength=$allFishLength  space=$space")
    return canAddFish
}

fun getFortune(birthday : Int) : String{
    var sent : MutableList<String> = mutableListOf("兇!","小小吉!","小吉!","中吉!","大吉!")

    return when(birthday){
        in 1..7 -> sent[0]
        in 28..31 -> sent[1]
        else -> "請輸入正確生日"
    }
}

fun getBirthday() : Int {
    println("請輸入生日的日(兩碼：1~31)：")
    return readLine()?.toInt() ?: 1
}

fun swim(speed : String = "fast"){
    println("swimming $speed")
}


