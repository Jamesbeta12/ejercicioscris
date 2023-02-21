// Creacion de Arreglos: val variableName = arrayOf(element, element1, element2, element3, ..., element10)
fun main() {
    val animals = arrayOf("Bird", "Cat", "Dog", "Bear", "Fish", "Lion")
    println(animals.contentToString())
    println(animals[0])
    println(animals[2])
    println(animals[4])
    animals[1] = "Wolf"
    animals[3] = "Chickens"
    animals[5] = "Fox"
    println(animals.contentToString())
    for (position in animals) {
        println(position)
    }
    for (position in animals.indices) {
        println("In the index ${position} we have ${animals[position]}")
    }
}