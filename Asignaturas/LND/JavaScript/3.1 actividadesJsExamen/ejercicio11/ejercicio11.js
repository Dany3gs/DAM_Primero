// Escribe un programa que pida una frase y escriba cuántas de las letras que tiene son 
// vocales

let frase2 = prompt("Escriba una frase para ver cuantas vocales y letras tiene:");

let vocales1 = 0;
let consonantes = 0;

    for (let i = 0; i < frase2.length; i++) {

        let letra = frase2[i];
        
        if ("aáAÁeéEÉiíIÍoóOÓuúUÚ".includes(letra)) {
            vocales1++;
        }
        
        if (letra === " ") {
            continue;
        } else {
            consonantes++;
        }
    };

document.write("De la frase: " + frase2 + "<br>");
document.write("La frase tiene " + vocales1 + " vocales de un total de " + consonantes + " letras" );