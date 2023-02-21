/*  Creacion de Mapas: 
val variableName = mutableMapOf(
    element to element1
    element2 to element3
    ...
    element9 to element10
) */
fun main() {
    val namesMap = mutableMapOf(
        "James" to 17,
        "Camila" to 22,
        "Samuel" to 9,
        "Sara" to 12
    )
    println(namesMap)
    namesMap.put("Camila", 22)
    namesMap["Camila"] = 25
    println(namesMap)
    for ((name, edad) in namesMap) {
        println("$name -> $edad")
    }
}