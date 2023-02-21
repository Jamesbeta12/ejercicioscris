// Estructura: Arreglos
fun main() {
    val sueldos = IntArray(5)
    // Carga de los elementos por teclado
    for (i in 0..4) {
        println("Ingrese sueldo: ")
        sueldos[i] = readLine()!!.toInt()
    }
    // Impresion de sus elementos
    println("Lista de Sueldos registrados: ")
    for (i in 0..4) {
        println(sueldos[i])
    }
}