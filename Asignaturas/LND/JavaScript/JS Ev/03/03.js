/*Escribe un programa en JavaScript que maneje un array con las alturas de N personas, donde N 
es un número ya definido. El programa debe calcular la altura media y determinar cuántas 
personas tienen una altura superior a la media y cuántas una altura inferior. Los resultados 
deben mostrarse en la página web (por pantalla). */


/*Lo que quiero hacer
1 crear una variable que contenga el número de personas
2 crear un array que tenga un total de elementos igual al numero de personas
3 asignar el valor de cada altura en orden al array
4 imprimir el array diciendo la posición de cada elemento del array  y el valor que tiene.
5 sumar todos los valores del array
6 dividir la suma total de alturas entre el total de personas 
*/

var numPersonas = prompt("Indique el número de personas:");

while (isNaN(numPersonas) || numPersonas <= 0) {
    numPersonas = prompt("Por favor, ingresa un número válido de personas:");
}

document.write("Has indicado un total de " + numPersonas + " personas. <br>");

var array = new Array(parseInt(numPersonas));

var suma = 0;

for (let i = 0; i < array.length; i++) {
    var alturas = parseFloat(prompt("Indica la altura de la persona " + (i + 1) + ":"));

    while (isNaN(alturas) || alturas <= 0) {
        alturas = parseFloat(prompt("Por favor, ingresa una altura válida para la persona " + (i + 1) + ":"));
    }

    suma += alturas;

    document.write("La altura de la persona " + (i + 1 )+ " es: " + alturas + " centímetros <br>");

    array[i] = alturas;
}

var media = suma / numPersonas;
media = media.toFixed(2); //limita a dos decimales la media

document.write("La media de la altura es: <b>" + media + "</b> centímetros <br>");  

var mayoresDeLaMedia = 0;
var menoresDeLaMedia = 0;
var igualMedia = 0;

for (let i = 0; i < array.length; i++) {
    if (array[i] > media ) {
        mayoresDeLaMedia++;
    } 
    if (array[i] < media) {
        menoresDeLaMedia++;
    }
    if (array[i] == media) {
        igualMedia++;
    }
}
document.write("Hay " + mayoresDeLaMedia + " personas mayores a la media. <br>"); 
document.write("Hay " + menoresDeLaMedia + " personas menores a la media. <br>");
document.write("Hay " + igualMedia + " personas iguales a la media. <br>");

