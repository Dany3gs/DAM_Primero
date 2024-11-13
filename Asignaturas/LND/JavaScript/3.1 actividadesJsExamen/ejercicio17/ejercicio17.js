// Escribir un programa que nos diga si un número dado es primo (no es divisible por
// ninguno otro número que no sea él mismo o la unidad)

/*Que es un número primo:
- El 1 o menores no son primos
- El 2 y 3 son los primeros números primos
- Si el número es par (numero % 2 === 0) o divisible por 3, no es primo
- Hay que verificar divisores de 5 hasta la raíz cuadrada del numero:
    - Comenzamos con un bucle for en 5 y con aumento de 6 en 6 para evitar números pares, mejora el cálculo
    - Seguimos en el bucle si el cuadrado de i es menor o igual a número. i * i <= numero, Esto optimiza el 
      proceso, ya que no es necesario comprobar divisores mayores que la raíz cuadrada del número.
    - Verificamos si el número es divisible por i o i + 2, si es diviisible, no es primo
 */

let numero = parseFloat(prompt("Indique un número para ver si es primo."));

function esPrimo(numero) {
    
    if (numero <= 1) {
        return false;
    }

    if (numero === 2 || numero === 3) {
        return true;
    } 

    if (numero % 2 === 0 || numero % 3 === 0) {
        return false;
    }

    for (let i = 5; i * i <= numero; i += 6){ // i += 6 para evitar números pares 
        if (numero % i === 0 || numero % (i + 2) === 0) {
            return false;
        }
    }
    return true;
}

if (esPrimo(numero)) {
    document.write(`El número ${numero} es primo`);
} else {
    document.write(`El número ${numero} no es primo`);
}