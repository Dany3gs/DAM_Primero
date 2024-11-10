//Escribir un programa que escriba en pantalla los divisores de un número dado

let numero = parseFloat(prompt("Diga un número para saber que divisores tiene"));
let multiplos = ""; // Variable para almacenar los múltiplos


    for (let i = 0; i <= numero; i++) {
        if (numero === 1) {
            continue;
        }
        if (numero % i === 0 ) {
            multiplos += (i + ", "); 
        }
    }

if (multiplos) {
    document.write("El número " + numero + " es múltiplo de: " + multiplos.trim()); // trim es para quitar espacios al final y al principio
} else {
    document.write("El número no tiene divisores");
}