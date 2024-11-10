//Escribe un programa que pida un número y diga si es divisible por 2


let divisible = parseFloat(prompt("Indique un número para ver si es divisible por 2."));


//let esDivisible = (divisible % 2 === 0) ? document.write("El número " + divisible + " es divisible por 2.") : document.write("El número " + divisible + " no es divisible por 2."); 

if (divisible % 2 == 0) {
    document.write("El número " + divisible + " es divisible por 2.");
} else {
    document.write("El número " + divisible + " no es divisible por 2.");
}

