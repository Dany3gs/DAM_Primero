//Escribe un programa que pida dos números y escriba en la pantalla cual es el mayor.



let num1 = parseFloat(prompt("Indique dos números, para ver cual es mayor:"));
let num2 = parseFloat(prompt("Indique otro número:"));

//let mayor = (num1 > num2) ? document.write(num1 + " Es mayor que " + num2) : document.write(num2 + " Es mayor que " + num1);

// let mayor = Math.max(num1, num2);
// document.write("El número mayor es : " + mayor);

if (num1 > num2) {
    document.write(num1 + " Es mayor que " + num2);
} else {
    document.write(num2 + " Es mayor que " + num1);
}