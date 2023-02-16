fun main() {
    println("Ingrese la edad: ")
    val edad = readLine()!!.toInt()

    if(edad < 18){
        println("la persona es menor")
    }else{
        println("la perosna es mayor")
    }
    println("la edad es $edad")
    
}