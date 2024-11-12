//Escribir un programa que escriba en pantalla los divisores comunes de dos números dados

let numero1 = parseFloat(prompt("Indique un número para comparar los divisibles con otro número."));
let numero2 = parseFloat(prompt("Escriba otro número"));
let divisores = ""; // Variable para almacenar los múltiplos


    for (let i = 0; i <= numero1; i++) {
        if (numero1 === 1) {
            continue;
        }
        if (numero1 % i === 0 ) {
            divisores += (i + ", "); 
        }
    }
    for (let i = 0; i <= numero2; i++) {
        if (numero2 === 1) {
            continue;
        }
        if (numero2 % i === 0 ) {
            divisores += (i + ", "); 
        }
    }

if (divisores) {
    document.write("El número " + numero + " es múltiplo de: " + divisores.trim()); // trim es para quitar espacios al final y al principio
} else {
    document.write("El número no tiene divisores");
}


//pdt


