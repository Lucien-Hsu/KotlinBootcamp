package Spice
sealed class Spice(val name: String, val spiciness: String = "mild", val color : SpiceColor){
    abstract fun prepartSpice()

    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
}

interface grind{
 fun grind()
}

interface SpiceColor{
    val color : Color
}

object YellowSpiceColor : SpiceColor{
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}


class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), grind{

    override fun prepartSpice() {
        grind()
    }

    override fun grind() {
    }

}

