// Añadir al ejercicio anterior que nos diga por cuál de los cuatro es divisible (hay que 
// decir todos por los que es divisible)

let numero = parseFloat(prompt("Escriba un número para ver si es divisible por 2, 3, 5 o 7"));
let multiplos = ""; // Variable para almacenar los múltiplos

if (numero % 2 === 0) {
    multiplos += "2 "; 
}
if (numero % 3 === 0) {
    multiplos += "3 ";
}
if (numero % 5 === 0) {
    multiplos += "5 ";
}
if (numero % 7 === 0) {
    multiplos += "7 ";
}
    
if (multiplos) {
    document.write("El número " + numero + " es múltiplo de: " + multiplos.trim()); // trim es para quitar espacios al final y al principio
} else { 
    document.write(`El número ${numero} no es múltiplo de 2, 3, 5 o 7.`);
}



