// Escribe un programa que pida una frase y escriba cuántas veces aparecen cada una 
// de las vocales

let frase = prompt("Escriba una frase para ver cuantas veces se repiten las vocales");

let contadorA = 0;
let contadorE = 0;
let contadorI = 0;
let contadorO = 0;
let contadorU = 0;

    for (let i = 0; i < frase.length; i++) {

        let letra = frase[i];
        
        if ("aáAÁ".includes(letra)) {
            contadorA++;
        } else if ("eéEÉ".includes(letra)) {
            contadorE++;
        } else if ("iíIÍ".includes(letra)) {
            contadorI++;
        } else if ("oóOÓ".includes(letra)) {
            contadorO++;
        } else if ("uúUÚ".includes(letra)) {
            contadorU++;
        }
    };

document.write("De la frase: " + frase + "<br>");
document.write("Tiene " + contadorA + " vocales a" + "<br>");
document.write("Tiene " + contadorE + " vocales e" + "<br>");
document.write("Tiene " + contadorI + " vocales i" + "<br>");
document.write("Tiene " + contadorO + " vocales o" + "<br>");
document.write("Tiene " + contadorU + " vocales u" + "<br>");

// let frase = prompt("Escriba una frase para ver cuántas veces se repiten las vocales");

// let vocales = { a: 0, e: 0, i: 0, o: 0, u: 0 }; // objeto

// [...frase.toLowerCase()].forEach(l => l in vocales && vocales[l]++);
// document.write(Object.entries(vocales).map(([v, c]) => `Tiene ${c} vocales ${v}<br>`).join("") + `De la frase: ${frase}<br>`);
