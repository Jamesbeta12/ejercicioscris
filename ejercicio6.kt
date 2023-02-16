//do 
//while

fun main(){
    var numero: Int
    var continuar = "si"

    do {
        print("Ingre un numero: ")
        numero = readLine()!!.toInt()
        if (numero < 0){
            numero = numero * -1
        }
        println("El numero positivo es: $numero")
        print("¿Desea ingresar otro numero? (si/no):")
        continuar = readLine()!!
    } while (continuar.uppercase() == "SI")
    }