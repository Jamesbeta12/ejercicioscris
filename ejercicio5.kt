fun main () {
    print ("ingrese una cantidad de numeros a procesar ")
    val cantidad = readLine() !!.toInt()
    for (i in 1..cantidad) {
        print("ingrese un numero")
        val numero = readLine ()!!.toInt()
        if (numero % 11 == 0){
            println ("el  numero $numero es divisible entre 11")
        }else{
            println("el numero $numero no es divisible entre 11")
        }
    }
}