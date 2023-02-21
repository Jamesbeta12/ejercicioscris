// Estructuras: Conjuntos 
data class Fecha(val dia: Int, val mes: Int, val año: Int)

fun main() {
    var feriados: Set<Fecha> = setOf(Fecha(1, 1, 2017),
                                     Fecha(25, 12, 2017))
    println("Ingrese una fecha")
    print("Ingrese el dia:")
    val dia = readln().toInt()
    print("Ingrese el mes:")
    val mes = readln().toInt()
    print("Ingrese el año:")
    val año = readln().toInt()
    if (Fecha(dia, mes, año) in feriados){
        println("La fecha ingresada es feriado")
    } else {
        println("La fecha ingresada no es feriado")
    }
}
