//Escribe un programa que pida una frase y escriba cuantas veces aparece la letra a

let frase = prompt("Escriba una frase:");

let letrasA = 0;
                                                
    for (let i = 0; i < frase.length; i++) {  

        let letra = frase[i];
            
        if (!"aáAÁ".includes(letra)) { 
         letrasA++; 
        }
    };

document.write("De la frase: " + frase + "<br>");
document.write("La letra \"a\" se repite " + letrasA + " veces");