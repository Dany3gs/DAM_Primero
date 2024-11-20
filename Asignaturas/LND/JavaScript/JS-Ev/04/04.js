/*Elabora un programa en JavaScript que pida al usuario ingresar una secuencia de 10 elementos 
que pueden ser letras o números enteros y los almacene en un array. Utiliza una función para 
evaluar este array, contando cuántas vocales y consonantes hay entre las letras, y cuántos 
números son positivos, negativos y ceros. Muestra estos resultados en la página web (por 
pantalla).

Lo que quiero hacer:

1 - Crear un array vacio para rellenar con 10 elementos de varios tipos de datos, letras y números enteros.
2 - Crear un for para rellenar el array con un prompt.
3 - Comprobar si el prompt está introduciendo letras o números con un condicional.
    Se comprueba si 'datos' no es "no un número" (!isNaN(datos)), es decir, si es un número.
    Y si no es una cadena vacia eliminando espacios en blanco con datos.trim() !== ''.
4 - Creamos variables para los datos que queremos contar.
5 - Creamos una función que hace la suma de los valores buscados.
6 - Con un forof recorremos los elementod del array, y vamos comprobando con typeof el tipo de dato
    si cada elemento es un número o string, sumando las variables contadoras en cada caso.

    En el caso de las letras, dentro de cada condicional, anidamos para separar las vocales 
    de las consonantes, en caso de las vocales usamos la función includes()'aeiouAEIOU'.includes(elementos), 
    si en este condicional no encuentra vocales, buscamos una letra del alfabeto con una expresión regular
     /^[a-zA-Z]$/, al haber descartado con el if anterior las vocales, con la función .test(elementos) 
    prueba si incluye una letra del alfabeto.
*/

 var array = [];

for (let i = 0; i < 10; i++) {
    var datos = prompt('Ingrese 10 elementos entre números y letras:');
    if (!isNaN(datos) && datos.trim() !== '') {
        array[i] = Number(datos); // Convertir a número
    } else {
        array[i] = datos; // Mantener como cadena
    }
}

document.write('El array "' + array + '" tiene lo siguiente <br>');

let vocales = 0, consonantes = 0, positivos = 0, negativos = 0, ceros = 0;

function evaluarArray () {
    for (let elementos of array) {

    if (typeof elementos === 'number') {
        // Si el elemento es un número
        if (elementos > 0) {
            positivos++;
        } else if (elementos < 0) {
            negativos++;
        } else {
            ceros++;
        }
    } else if (typeof elementos === 'string') {
        // Si el elemento es una letra primero buscamos las vocales
        if ('aeiouAEIOU'.includes(elementos)) {
            vocales++;
        // Si no encuentra vocales en el if anterior, busca consonantes en todo el abecedario    
        } else if (/^[a-zA-Z]$/.test(elementos)) {
            consonantes++;
        }
    }
}
// Mostrar los resultados en formato lista en html
document.write('<ul>');
if (positivos > 0) document.write(`<li>Números positivos: ${positivos}</li>`);
if (negativos > 0) document.write(`<li>Números negativos: ${negativos}</li>`);
if (ceros > 0) document.write(`<li>Ceros: ${ceros}</li>`);
if (vocales > 0) document.write(`<li>Vocales: ${vocales}</li>`);
if (consonantes > 0) document.write(`<li>Consonantes: ${consonantes}</li>`);
document.write('</ul>');
}

evaluarArray();