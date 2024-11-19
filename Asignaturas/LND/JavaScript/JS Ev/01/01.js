/*Desarrolla un programa en JavaScript que utilice un array predefinido con 10 números enteros. 
El programa debe recorrer el array y determinar cuántos números son positivos, cuántos 
negativos y cuántos ceros. Los resultados deben mostrarse directamente en la página web (por 
pantalla).

ej; -20, 29, 9, 99, 87, -10, 0, 0, -50, 0
 */

let numeros = prompt("Escriba 10 números separados por comas");

let arrayNumeros = numeros.split(",").map(Number); // con la función split() indicamos la separación y que cambie con map(Number)de String a Number
                                                   // con esto creamos el array a partir de la entrada de texto del usuario

//document.write(numeros) sobra, solo para comprobar números insertados en consola

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

document.write("Hay " + positivos + " números positivos. <br>");
document.write("Hay " +  negativos + " números negativos. <br>");
document.write("Hay " +  ceros + " ceros. <br>");