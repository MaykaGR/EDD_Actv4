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
fun notaAlfab (nota: Int): String{
    val mensaje = when{
        nota < 5 ->  "Suspenso"
        nota >= 5 ->  "Aprobado"
        nota < 7 -> "Aprobado"
        nota >=7 -> "Notable"
        nota <= 8 -> "Notable"
        nota >= 9 -> "Sobresaliente"
        nota == 10 -> "Sobresaliente"
        else -> "Error"
    }
    return mensaje
}

fun main() {
    println("Introduce la nota: ")
    val nota = readLine()?.toInt()?: 0
    println(notaAlfab(nota))
}