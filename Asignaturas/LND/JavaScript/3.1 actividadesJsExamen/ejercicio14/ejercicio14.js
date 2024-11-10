// Añadir al ejercicio anterior que nos diga por cuál de los cuatro es divisible (hay que 
// decir todos por los que es divisible)

let frase5 = parseFloat(prompt("Escriba un número para ver si es divisible por 2, 3, 5 o 7"));
let multiplos = ""; // Variable para almacenar los múltiplos

if (frase5 % 2 === 0) {
    multiplos += "2 "; 
}
if (frase5 % 3 === 0) {
    multiplos += "3 ";
}
if (frase5 % 5 === 0) {
    multiplos += "5 ";
}
if (frase5 % 7 === 0) {
    multiplos += "7 ";
}
    
if (multiplos) {
    document.write("El número " + frase5 + " es múltiplo de: " + multiplos.trim()); // trim es para quitar espacios al final y al principio
} else { 
    document.write(`El número ${frase5} no es múltiplo de 2, 3, 5 o 7.`);
}

// Mirar con Leandro document.write(`El número ${frase5} no es múltiplo de 2, 3, 5 o 7.`);

