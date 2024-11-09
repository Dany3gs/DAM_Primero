//Escribe un programa que pida una frase y escriba las vocales que aparecen

let frase1 = prompt("Escriba una frase para ver cuantas vocales tiene:");

let vocales = 0;

    for (let i = 0; i < frase1.length; i++) {

        let letra = frase1[i];

        if ("aáAÁeéEÉiíIÍoóOÓuúUÚ".includes(letra)) {
         vocales++;
        }
    };

document.write("De la frase: " + frase1 + "<br>");
document.write("La frase tiene " + vocales + " vocales");