/*Fecha: 26/01/22
Versión:
Autor: MªCarmen González Ruiz
Empresa/Entidad: Rafael Alberti
Proyecto: Crear un array de 20 números aleatorios. Por medio de dos funciones se ordena de menor a mayor y
se suma los números que incluya el array.
 */
fun menorMayor(lista:IntArray, cant:Int): IntArray{
    val listaOrdenada = lista
    repeat (cant){
        var j = 0
        var j2= 1
        repeat(cant-1){
            var temporal: Int
            if(listaOrdenada[j]>listaOrdenada[j2]){
                temporal=listaOrdenada[j]
                listaOrdenada[j]=listaOrdenada[j2]
                listaOrdenada[j2]=temporal
            }
            j= j+1
            j2=j2+1}
    }
    return listaOrdenada
}

fun sumaArray(lista:IntArray, cant:Int): Int{
    var num = 0
    var total = 0
   for(i in 0..cant-1){
    num = lista[i]
       total = total+num
   }
    return total
}

fun main() {
   var arr = IntArray(20)
    for(i in 0..19){
        var temp = (1..9).random()
        arr[i]=temp
    }
    print("El array aleatorio es: ")
    for(i in 0..arr.size-1){(print("${arr[i]}, "))}
    println("")
    print("Son pares: ")
    for(i in 0..19){
       if(arr[i]%2==0) {
           print("${arr[i]}, ")
       }
    }
    println("")
    var ordenada = menorMayor(arr,20)
    print("El primer número en el array ordenado de menor a mayor es: ")
    println(ordenada[0])
    println("")
    print("La suma de todos los números del array es: ")
    println(sumaArray(arr,20))
}