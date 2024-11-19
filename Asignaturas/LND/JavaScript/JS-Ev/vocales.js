    /*Si se utilizan funciones para realizar los cálculos en el programa se sumará 0.5 ptos a cada
    apartado.*/

    /*1. a. Escribe un programa que pida una frase y escriba por pantalla cuántas veces aparecen
    cada una de las vocales, también debe calcular el total de vocales que aparecen en dicha frase.*/

    let frase = prompt("Escriba una frase").toLowerCase() //con la función prompt() solicitamos por navegador el texto

    //creamos una variable por cada vocal para guardar los valores en cada una de ella para almacenar la suma

    let contadorA = 0
    let contadorE = 0
    let contadorI = 0
    let contadorO = 0
    let contadorU = 0
    let contadorTotal = 0

    //Creamos una función con un for que recorrerá la frase, creamos una variable para localizar mediante un condicional switch las vocales, si coinciden, 
    //aumentando las variables contadoras, para la suma total, sumamos las variables contadoras

    function calculoVocales(){
        
        for (let i = 0; i < frase.length; i++) {
            let caracter = frase[i] // Tomamos el carácter actual de la frase.

            // Usamos la función .includes() para verificar si el carácter actual es una vocal (sin o con tilde).
            if ("aáAAÁ".includes(caracter)) {
                contadorA++;
            } else if ("eé".includes(caracter)) {
                contadorE++;
            } else if ("ií".includes(caracter)) {
                contadorI++;
            } else if ("oó".includes(caracter)) {
                contadorO++;
            } else if ("uú".includes(caracter)) {
                contadorU++;
            }
        }
        
        contadorTotal = contadorA + contadorE + contadorI + contadorO + contadorU

        document.write("La frase es: " + frase)
        document.write("Hay tantas a: " + contadorA)
        document.write("Hay tantas e: " + contadorE)
        document.write("Hay tantas i: " + contadorI)
        document.write("Hay tantas o: " + contadorO)
        document.write("Hay tantas u: " + contadorU)
        document.write("El número total de vocales es: " + contadorTotal)
    }


    //b. Indica si el número total de vocales que aparece en la frase anterior es divisible por 2, 3, 5 o 7

    //Para la comprobación si son divisibles, creamos una función con una variable booleana iniciada en false para indicar si no es divisible por ningún 
    //número de los indicados, imprimir un texto para indicarlo.
    //Mediante condicionales vamos comprobando la variable contadorTotal y sacando el módulo de cada número pedido, si el valor del módulo es 0, es divisible.
    //En caso de ser divisible, indicamos la variable divisibles a true por que cumple con el condicional.

    function esDivisible(){
        let divisibles = false

        if (contadorTotal % 2 === 0) {
            document.write("El número total de vocales es divisible por 2.")
            divisibles = true // revisar con mister
        }
        if (contadorTotal % 3 === 0) {
            document.write("El número total de vocales es divisible por 3.")
            divisibles = true
        }
        if (contadorTotal % 5 === 0) {
            document.write("El número total de vocales es divisible por 5.")
            divisibles = true
        }
        if (contadorTotal % 7 === 0) {
            document.write("El número total de vocales es divisible por 7.")
            divisibles = true
        }
        if (!divisibles) {
            document.write(contadorTotal + " no es divisible entre 2, 3, 5, o 7")
        }
    }

    /*c. indica si el número total de vocales de la frase del apartado a es mayor, menor o igual
    que 5 mostrando un mensaje que lo indique (0.5ptos)*/

    function mayorMenorIgual() {
        
        if (contadorTotal === 5) {
            document.write("El número total de la suma de las vocales es igual a 5 <br>")
        }
        if (contadorTotal > 5) {
            document.write("El número total de la suma de las vocales es mayor a 5")
        }
        if (contadorTotal < 5) {
            document.write("El número total de la suma de las vocales es menor a 5")
        }
    }

    calculoVocales()
    esDivisible()
    mayorMenorIgual()

    //mirar cambiar para imprimir todo en el html con console.write(), y separar con <br> de htmñ