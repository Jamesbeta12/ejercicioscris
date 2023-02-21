// Creacion de Listas: val variableName = listOf(element, element1, element2, element3, ..., element10)
// Creacion de Listas Mutables: val variableName: MutableList = mutableListOf(element, element1, element2, ..., element10)
fun main() {
    println("Lista: Numbers")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(numbers)
    println(numbers[0])
    println(numbers[2])
    println(numbers[4])
    println(numbers[6])
    println(numbers[8])
    for (position in numbers.indices) {
        println("In the index ${position} we have ${numbers[position]}")
    }
    println("Lista Mutable: MutableNumbers")
    val mutableNumbers: MutableList<Int> = mutableListOf<Int>(1, 21, 32, 43, 55, 66)
    println(mutableNumbers)
    println(mutableNumbers[0])
    println(mutableNumbers[2])
    println(mutableNumbers[4])
    mutableNumbers[1] = 11
    mutableNumbers[3] = 40
    mutableNumbers[5] = 5
    println(mutableNumbers)
    for (position in mutableNumbers.indices) {
        println("In the index ${position} we have ${mutableNumbers[position]}")
    }
}