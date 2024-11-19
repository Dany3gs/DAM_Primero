/*Elabora un programa en JavaScript que pida al usuario ingresar una secuencia de 10 elementos 
que pueden ser letras o números enteros y los almacene en un array. Utiliza una función para 
evaluar este array, contando cuántas vocales y consonantes hay entre las letras, y cuántos 
números son positivos, negativos y ceros. Muestra estos resultados en la página web (por 
pantalla).

Lo que quiero hacer:

1 - crear un array de 10 elementos de varios tipos de datos
2 - hay que contar con una función las vocales y consonantes, 
3 - hay que contar los números positivos, negativos y 0, 
4 - imprimir en web los resultado de todos
*/

let frase = prompt("Escribe lo que quieras:")

let array = frase.split(""); // usamos la función split para crear el array

// function valoresArray () {

// let vocales = 0;
// let consonantes = 0;
// let numerosPositivos = 0
// let numerosNegativos = 0
// let numerosCeros = 0

//     for (let i = 0; i < array.length; i++) {
//         let letra = array[i];

//         let tieneLetras = array.some(item => typeof item === "string");
//             if ("aeiou".includes(tieneLetras)) {
//                         vocales++;
//                     } else if (tieneLetras) {
//                         consonantes++;
//                     }

//         let tieneNumeros = array.some(item => typeof item === "number");
    
//         if (tieneNumeros > 0) {
//             numerosPositivos++;
//         } else if (tieneNumeros < 0) {
//             numerosNegativos++;
//         } else if (tieneNumeros == 0) {
//             numerosCeros++;
//         }
        
//     };

//     document.write("La frase " + frase + "<br>");
//     document.write("La frase tiene " + vocales + " vocales <br>");
//     document.write("La frase tiene " + consonantes + " consonantes <br>");

//     document.write("La frase " + frase + "<br>");
//     document.write("Tiene " + numerosPositivos + " números positivos <br>");
//     document.write("Tiene " + numerosNegativos + " números positivos <br>");
//     document.write("Tiene " + numerosCeros + " números positivos <br>");


//}

//valoresArray();