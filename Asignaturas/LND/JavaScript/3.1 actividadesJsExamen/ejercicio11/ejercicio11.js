// Escribe un programa que pida una frase y escriba cuántas de las letras que tiene son 
// vocales

let frase = prompt("Escriba una frase para ver cuantas vocales y letras tiene:");

let vocales = 0;
let consonantes = 0;

    for (let i = 0; i < frase.length; i++) {

        let letra = frase[i];
        
        if ("aáAÁeéEÉiíIÍoóOÓuúUÚ".includes(letra)) {
            vocales++;
        }
        
        if (letra === " ") {
            continue;
        } else {
            consonantes++;
        }
    };

document.write("De la frase: " + frase + "<br>");
document.write("La frase tiene " + vocales + " vocales de un total de " + consonantes + " letras" );