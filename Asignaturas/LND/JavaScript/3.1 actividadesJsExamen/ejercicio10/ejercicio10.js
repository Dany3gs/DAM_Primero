//Escribe un programa que pida una frase y escriba las vocales que aparecen

let frase1 = prompt("Escriba una frase para ver que vocales tiene:");

let vocales = 0;
let contadorA = 0;
let contadorE = 0;
let contadorI = 0;
let contadorO = 0;

    for (let i = 0; i < frase1.length; i++) {

        let letra = frase1[i];
     
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

document.write("De la frase: " + frase1 + "<br>");

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
