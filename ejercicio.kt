// if, else , else if
// condicionales simples

fun  main() {
    println ("ingrese un numero positivo: ")
    val num = readLine()!!.toInt()

    if (num < 0){
        println("el numero no es positivo")
    }
    println("el numero es: $num")
}
