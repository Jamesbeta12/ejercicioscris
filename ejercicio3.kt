fun main (){
    println("Ingre el nombre: ")
    val nombre = readLine()!!
    println("Ingre la materia: ")
    val materia = readLine()!!
    
    println("Ingrese nota 1: ")
    val nota1 = readLine()!!.toFloat()
    println("Ingrese la nota 2: ")
    val nota2 = readLine()!!.toFloat()
    println("Ingrese la nota 3: ")
    val nota3 = readLine()!!.toFloat()

    val prom = (nota1 + nota2 + nota3) / 3
    println("El promedio de notas es: $prom")
    if(prom >= 3.5){
        println("El estudiante $nombre  GANÓ la materia: $materia")
    } else {
        println("El estudoiante $nombre PERDIÓ la materia: $materia")
        if(prom >= 2.5){
            println("$nombre puede RECUPERAR")
        }
    }
}