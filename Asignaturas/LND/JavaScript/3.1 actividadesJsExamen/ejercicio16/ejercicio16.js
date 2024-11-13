//Escribir un programa que escriba en pantalla los divisores comunes de dos números dados

let numero1 = parseFloat(prompt("Indique un número para comparar los divisibles con otro número."));
let numero2 = parseFloat(prompt("Escriba otro número"));

let divisores1 = [];
let divisores2 = [];
let divisoresComunes = [];

//obtenemos los divisores de numero1
  for (let i = 1; i <= numero1; i++) {
        if (numero1 % i === 0 ) {
            divisores1.push(i); // con push añadimos i al final del array
        }
    }

//obtenemos los divisores de numero2  
   for (let i = 0; i <= numero2; i++) {
        if (numero2 % i === 0) {
            divisores2.push(i);
        }
    }
//con un forof recorremos divisores1, en cada iteración el valor actual de divisoeres1 se asigna a divisor 
    for (let divisor of divisores1) {
        if (divisores2.includes(divisor)) { //Con .includes(divisor) comprobamos si divisores2 contiene el valor divisor. Si es así, significa que el divisor es común a ambos números.
            divisoresComunes.push(divisor); //Si divisor se encuentra en ambos arrays (divisores1 y 2) se agrega a divisoresComunes con push().
        }
    }
  
document.write("El número " + numero1 + " tienen como divisores: " + divisores1.join() + "<br>"); // con .join() separamos los elementos del array, por defecto separa por ","
document.write("El número " + numero2 + " tienen como divisores: " + divisores2.join() + "<br>"); 
document.write("Los divisores en común son " + divisoresComunes.join() + "<br>"); 








