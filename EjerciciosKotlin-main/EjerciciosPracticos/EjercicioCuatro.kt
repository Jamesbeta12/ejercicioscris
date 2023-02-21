// Estructuras: Mapas
data class Producto(val nombre: String, val precio: Float, val cantidad: Int)
fun cargar(productos: MutableMap<Int, Producto>) {
    productos[1] = Producto("Papas", 13.15f, 200)
    productos[15] = Producto("Manzanas", 20f, 0)
    productos[20] = Producto("Peras", 3.50f, 0)
}
fun listadoCompleto(productos: MutableMap<Int, Producto>) {
    println("Listado completo de productos")
    for((codigo, producto) in productos) {
        println("Codigo: $codigo  DescripciOn ${producto.nombre} Precio: ${producto.precio} Stock Actual: ${producto.cantidad}")
    }
println()
}
fun consultaProducto(productos: MutableMap<Int, Producto>) {
    print("Ingrese el codigo de un producto:")
    val codigo = readln().toInt()
    if (codigo in productos){
        println("Nombre: ${productos[codigo]?.nombre} Precio: ${productos[codigo]?.precio} Stock: ${productos[codigo]?.cantidad}")
    } else {
        println("No existe un producto con dicho codigo")
    }
}
fun sinStock(productos: MutableMap<Int, Producto>) {
    val cant = productos.count { it.value.cantidad == 0 }
    println("Cantidad de artículos sin stock: $cant")
}
fun main() {
    val productos: MutableMap<Int, Producto> = mutableMapOf()
    cargar(productos);
    listadoCompleto(productos)
    consultaProducto(productos)
    sinStock(productos)
}
