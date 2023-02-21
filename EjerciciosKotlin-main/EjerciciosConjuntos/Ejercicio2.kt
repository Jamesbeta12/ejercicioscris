// Creacion de Conjuntos: val variableName = setOf(element, element1, element2, element3, ..., element10)
// Creacion de Conjuntos Mutables: val variableName = mutableSetOf(element, element1, element2, element3, ..., element10)
// Jan, Feb, Mar, Apr, May, Jun, Jul, Aug,    Sep, Oct, Nov, Dec
fun main() {
    println("Conjunto: Months")
    val months = setOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug")
    println(months)
    months.forEach { println(it) }
    println("Conjunto Mutable: mutableMonths")
    val mutableMonths = mutableSetOf("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug")
    println(mutableMonths)
}