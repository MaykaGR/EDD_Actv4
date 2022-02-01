/*Fecha: 26/01/22
Versión:
Autor: MªCarmen González Ruiz
Empresa/Entidad: Rafael Alberti
Proyecto: crea una función en kotlin que según el valor de una variable que se llame “nota”,
decida el valor a imprimir en pantalla, usando la sentencia When. Siendo < 5 suspenso, entre 5 y
menos que 7 aprobado, entre 7 y 8 notable y entre 9 y 10 incluido sobresaliente. Y si el valor es
diferente a este rango, que diga “el valor introducido no es correcto”.
 */

//Función que te indica en palabras el estado de una nota en base al número
fun notaAlfab (nota: Float): String{
    var mensaje = when{
        nota == 10.0F -> "Sobresaliente"
        nota >= 9 -> "Sobresaliente"
        nota >=7 -> "Notable"
        nota >= 5 ->  "Aprobado"
        nota < 5 ->  "Suspenso"
        else -> "Error"
    }
    if(nota !in 1.0..10.0){
        mensaje = "Nota incorrecta"
    }
    return mensaje
}

fun main() {
    println("Introduce la nota: ")
    val nota = readLine()?.toFloat()?: 0.0F
    println(notaAlfab(nota))
}