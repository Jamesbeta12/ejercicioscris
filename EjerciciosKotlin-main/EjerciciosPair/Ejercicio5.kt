// Creacion de Pair: val variableName = Pair("element1", element2)
fun main() {
    val userPassword = Pair("Clarita22", 51300)
    println(userPassword)
    println(userPassword.first)
    println(userPassword.second)
    for (position in userPassword) {
        println(position)
    }
}