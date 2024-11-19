/*Crea un programa en JavaScript que inicialice un array con 10 números enteros ya establecidos. 
Este programa debe calcular y presentar en la página web la media de los números positivos y 
la media de los números negativos contenidos en el array (por pantalla). 

ej; -20, 29, 9, 99, 87, -10, 0, 0, -50, 0
*/


let numeros = prompt("Escriba 10 números separados por comas");

let arrayNumeros = numeros.split(",").map(Number); // con la función split() indicamos la separación y que cambie con map(Number)de String a Number
                                                   // con esto creamos el array a partir de la entrada de texto del usuario

console.log(numeros); // sobra, solo para comprobar números insertados en consola

let positivos = 0;
let negativos = 0;
let ceros = 0;

//recorremos el array y vamos incrementando los valores de cada variable pedida para tener la cantidad de cada una
for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] < 0 ) {
        negativos++;
    }
    if (arrayNumeros[i] === 0 ) {
        ceros++;
    }
    if (arrayNumeros[i] > 0 ) {
        positivos++;
    }
}

let mediaPositivos = 0;

for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] > 0 ) {
        mediaPositivos += arrayNumeros[i];
    }
}

document.write("La media de los números positivos es: " + mediaPositivos / positivos + " <br> ");

let mediaNegativos = 0

for (let i = 0; i < arrayNumeros.length; i++) {
    if (arrayNumeros[i] < 0 ) {
        mediaNegativos += arrayNumeros[i]
    }
}

document.write("La media de los números negativos es: " + mediaNegativos / negativos + " <br>" ) //TODO: da decimales, solo enteros??