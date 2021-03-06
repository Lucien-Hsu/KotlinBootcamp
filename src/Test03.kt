fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(
    mood : String,
    weather : String = "sunny",
    temperature : Int = 24
) : String{
    return when{
         isHappy(mood, weather)-> "go for a walk"
         isSad(mood, weather, temperature)-> "stay in bed"
         isHot(temperature)-> "go swimming"
        else -> "stay home and read"
    }
}

fun isHappy(mood: String, weather: String) = (mood == "happy" && weather == "sunny")
fun isSad(mood: String, weather: String, temperature: Int) = (mood == "sad" && weather == "rainy" && temperature == 0)
fun isHot(temperature: Int) = (temperature > 35)