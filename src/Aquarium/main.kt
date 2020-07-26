package Aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("L:${myAquarium.length} W:${myAquarium.width} H:${myAquarium.height}")

    /*
    myAquarium.height = 80
    println("H:${myAquarium.height} cm")
    println("Volume:${myAquarium.volume} liters")
*/
    val smallAquarium = Aquarium(20,15,30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("L:${myAquarium2.length} W:${myAquarium2.width} H:${myAquarium2.height}")
}