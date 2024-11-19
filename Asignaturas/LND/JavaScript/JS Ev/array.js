
/*2. a. Realiza un programa JavaScript que guarde en un array 10 números enteros que
se leen por teclado. A continuación, se recorre el array y calcula cuántos números son
positivos, cuántos negativos y cuántos ceros. (0.75 ptos)

ej; -20, 29, 9, 99, 87, -10, 0, 0, -50, 0
*/

let numeros = prompt("Escriba 10 números separados por comas")

let arrayNumeros = numeros.split(",").map(Number); // con la función split() indicamos la separación y que cambie con map(Number)de String a Number
                                                   // con esto creamos el array a partir de la entrada de texto del usuario

console.log(numeros) // sobra, solo para comprobar números insertados en consola

let positivos = 0
let negativos = 0
let ceros = 0

//recorremos el array y vamos incrementando los valores de cada variable pedida para tener la cantidad de cada una
for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] < 0 ) {
        negativos++
    }
    if (arrayNumeros[i] === 0 ) {
        ceros++
    }
    if (arrayNumeros[i] > 0 ) {
        positivos++
    }
}

console.log("Hay " + positivos + " números positivos")
console.log("Hay " +  negativos + " números negativos")
console.log("Hay " +  ceros + " ceros")


/*b. Calcula y muestra la media de los valores positivos y la de los valores negativos del
array del apartado anterior. Muéstralo por pantalla (0.75ptos)*/

//creamos una variable para ir acumulando con un for la suma de cada valor de i en cada vuelta.
//para sacar la media, aprovechamos la variable positivos que tiene el total que necesitamos.
let mediaPositivos = 0

for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] > 0 ) {
        mediaPositivos += arrayNumeros[i]
    }
}

console.log("La media de los números positivos es:" + mediaPositivos / positivos)

let mediaNegativos = 0

for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] < 0 ) {
        mediaNegativos += arrayNumeros[i]
    }
}

console.log("La media de los números negativos es:" + mediaNegativos / negativos) //TODO: da decimales, solo enteros??

/*c. Calcula y muestra la suma de los valores positivos y la suma de los valores negativos presentes
en el array del apartado a, para ello debes usar una función. Muestra los resultados por pantalla. (
1.5pto) */

//Creamos la función con una variable para guardar los valores a sumar, "positivos" y "negativos"
//Con un for recorremos el mismo array con un condicional para sumar la variable con el valor de la posición del array 

function sumaValoresPositivos() {

    let sumaPositivos = 0

    for (let i = 0; i < arrayNumeros.length; i++) {
        if (arrayNumeros[i] > 0 ) {
            sumaPositivos += arrayNumeros[i] //suma los valores solicitados
        }
    }
    console.log("La suma de los números positivos es:" + sumaPositivos)
}

function sumaValoresNegativos() {

    let sumaNegativos = 0

    for (let i = 0; i < arrayNumeros.length; i++) {
        if (arrayNumeros[i] < 0 ) {
            sumaNegativos += arrayNumeros[i]
        }
    }
    console.log("La suma de los números positivos es:" + sumaNegativos)
}

sumaValoresPositivos()
sumaValoresNegativos()

/*3. a. indica los fallos del ejercicio: (debes ponerlo en un comentario al lado del error y
poner cual es la opción correcta, de la palabra o expresión errónea). (2 puntos).*/

// mirar opción con arrays