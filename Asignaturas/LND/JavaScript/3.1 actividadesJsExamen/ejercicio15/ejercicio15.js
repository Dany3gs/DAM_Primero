//Escribir un programa que escriba en pantalla los divisores de un número dado

let numero = parseFloat(prompt("Diga un número para saber que divisores tiene"));
let divisores = ""; // Variable para almacenar los múltiplos


    for (let i = 0; i <= numero; i++) {
        if (numero === 1) {
            continue;
        }
        if (numero % i === 0 ) {
            divisores += (i + ", "); 
        }
    }

if (divisores) {
    document.write("El número " + numero + " es divisor de: " + divisores.trim()); // trim es para quitar espacios al final y al principio
} else {
    document.write("El número no tiene divisores");
}