// Añadir al ejercicio anterior que nos diga por cuál de los cuatro es divisible (hay que 
// decir todos por los que es divisible)

let frase5 = parseFloat(prompt("Escriba un número para ver si es divisible por 2, 3, 5 o 7"));

if (frase5 % 2 === 0) {
    document.write("El número es divisible por 2.")
} else if (frase5 % 3 === 0) {
    document.write("El número es divisible por 3.")
} else if (frase5 % 5 === 0) {
    document.write("El número es divisible por 5.")
} else if (frase5 % 7 === 0) {
    document.write("El número es divisible por 7.")
} else {
    document.write("El número no es divisible por los indicados.")
}

// pdt revisar 