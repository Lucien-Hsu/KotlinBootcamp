package Decorations

fun main (args: Array<String>){
    makeDecorations()
}

fun makeDecorations(){
    val d1 = Decorations("rock")
    println(d1)
    val d2 = Decorations("slate")
    println(d2)
    val d3 = Decorations("slate")
    println(d3)

    //做比較
    println("d1 = d2:" + d1.equals(d2))
    println("d3 = d2:" + d3.equals(d2))

    //複製內容給另一個物件
    val d4 = d3.copy()
    println(d3)
    println(d4)

    //建立一個兩參數的 data class
    val d5 = Decorations2("slate","wood")
    println(d5)

    //將 data class 分解出來
    val (rock, wood) = d5
    println(rock)
    println(wood)

    //val t1 = test("OK")
    //println(t1.a)

    val c = Color.BLUE
    println(c)

}

//建立 data class
data class Decorations(val rocks: String){}

data class Decorations2(val rocks: String, val wood: String){}

//data class test(val a: String){ val aa = a}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}