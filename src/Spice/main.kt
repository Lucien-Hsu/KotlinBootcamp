package Spice

fun main() {
    val myCurry = Curry("curry2","hot")
    //注意，第一個color參數為介面，第二個color為介面中的屬性，這才是真正儲存顏色的地方
    println("test: ${myCurry.color.color}")




    /*
    val mySpice = listOf(
        Curry("curry", "mild"),
        Curry("pepper", "medium"),
        Curry("cayenne", "spicy"),
        Curry("ginger", "mild"),
        Curry("red curry", "medium"),
        Curry("green curry", "mild"),
        Curry("hot pepper", "extremely spicy")
    )

    //val spicelist = mySpice.filter {it.heat < 5}

    fun makeSalt() = Curry("Salt", "hot")

    println(Curry("000","mild"))
    //println("1:${mySpice[0]}  2:${mySpice[1]}  3:${hotList[0]}  4:${makeSalt()}")
*/
}
