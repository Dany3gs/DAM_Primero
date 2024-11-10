// Escribe un programa que pida un número y nos diga si es divisible por 2, 3, 5 o 7 
// (sólo hay que comprobar si lo es por uno de los cuatro)


let frase4 = parseFloat(prompt("Escriba un número para ver si es divisible por 2, 3, 5 o 7"));

if (frase4 % 2 === 0) {
    document.write("El número es divisible por 2.")
} else if (frase4 % 3 === 0) {
    document.write("El número es divisible por 3.")
} else if (frase4 % 5 === 0) {
    document.write("El número es divisible por 5.")
} else if (frase4 % 7 === 0) {
    document.write("El número es divisible por 7.")
} else {
    document.write("El número no es divisible por los indicados.")
}

