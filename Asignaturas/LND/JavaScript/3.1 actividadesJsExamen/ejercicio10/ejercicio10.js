//Escribe un programa que pida una frase y escriba las vocales que aparecen

let frase = prompt("Escriba una frase para ver que vocales tiene:");

let vocales = 0;
let contadorA = 0;
let contadorE = 0;
let contadorI = 0;
let contadorO = 0;
let contadorU = 0;

    for (let i = 0; i < frase.length; i++) {

        let letra = frase[i];
     
        if ("aáAÁ".includes(letra)) {
            contadorA++
        } 
        if ("eéEÉ".includes(letra)) {
            contadorE++
        }
        if ("iíIÍ".includes(letra)) {
            contadorI++
        }
        if ("oóOÓ".includes(letra)) {
            contadorO++
        }
        if ("uúUÚ".includes(letra)) {
            contadorU++
        }
    };

document.write("De la frase: " + frase + "<br>");

    if (contadorA > 0) {
        document.write("La frase tiene la letra A <br>");
    } 
    if (contadorE > 0) {
        document.write("La frase tiene la letra E <br>");
    }
    if (contadorI > 0) {
        document.write("La frase tiene la letra I <br>");
    }
    if (contadorO > 0) {
        document.write("La frase tiene la letra O <br>");
    } 
    if (contadorU > 0) {
        document.write("La frase tiene la letra U <br>");
    }
    if (contadorA == 0 && contadorE == 0 && contadorI == 0 && contadorO == 0 && contadorU == 0) {
        document.write("La frase no tiene vocales");
    }


// let vocales = "aeiou";
// let cadena = prompt("Introduzca una frase:");

// let resultado = "";
// for (var i = 0; i < vocales.length; i++) {
//     if (cadena.match(new RegExp(vocales[i], 'gi')) !== null) {
//         resultado += vocales[i] + ", ";
//     }
// }
// if (resultado.length > 0) {
//     resultado = "La cadena '" + cadena + "' contiene las vocales " + resultado
//     document.write(resultado.substring(0, resultado.length - 2));
// } else {
//     document.write("La cadena '" + cadena + "' No contiene vocales")
// }
