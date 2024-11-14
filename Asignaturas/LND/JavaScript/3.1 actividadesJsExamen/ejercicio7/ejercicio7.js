// Escribe un programa que pida 3 números y escriba en la pantalla el mayor de los 
// tres.

let num_1 = parseFloat(prompt("Indique tres números para ver cual es el mayor:"));
let num_2 = parseFloat(prompt("Indique otro número:"));
let num_3 = parseFloat(prompt("Indique otro número:"));

document.write("Los números son: " + num_1 + " - " + num_2 + " - "+ num_3 + "<br>");

if (num_1 > num_2 || num_1 > num_3) {
    document.write(num_1 + " Es el número mayor");
} else if (num_2 > num_1 || num_2 > num_3) {
    document.write(num_2 + " Es el número mayor");
} else {
    document.write(num_3 + " Es el número mayor");
}