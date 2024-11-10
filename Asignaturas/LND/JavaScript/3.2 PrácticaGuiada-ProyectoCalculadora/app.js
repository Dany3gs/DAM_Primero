

/* ******Se realizan modificaciones al código del video de la práctica por no conseguir que realizara múltiples cálculos.******* */



var cifra = "";
var acumulado = 0;
var p_operacion = true; // variable que usamos para saber la primera operacion
var sumar = false;
var restar = false;
var multiplicar = false;
var dividir = false;

function display_numeros(numero) {
    // Si "cifra" es "0" y se agrega un nuevo número, lo sustituimos, pero no permitimos agregar más ceros al inicio
    // Esto nos permite agregar "0" después de indicar algún número
    if (cifra === "0") {
        cifra = numero;
    } else {
        cifra += numero;
    }
    document.getElementById("display").value = cifra;
}


//Para el decimal, creamos una función y usamos la función includes(".") para indicar el separador de decimal
function display_decimal() {

    if (!cifra.includes(".")) { // comprobamos si cifra tiene un punt decimal, para evitar que se repita
        cifra = cifra === "" ? "0." : cifra + "."; // con un operador ternario, indicamos como incluir el "."Si cifra está vacía, "0.", si no, (cifra + ".").
        document.getElementById("display").value = cifra;
    }
}

// Creamos una función por tipo de operación, que llama a la función realizarOperación(), que es la que hace el cálculo según se solicite.

function suma() {
    realizarOperacion();
    sumar = true; // indicamos que sumar es true para que realize este cáculo
    restar = multiplicar = dividir = false; // el resto de funciones las ponemos en false para que no las realize.
}

function resta() {
    realizarOperacion();
    restar = true;
    sumar = multiplicar = dividir = false;
}

function multiplicacion() {
    realizarOperacion();
    multiplicar = true;
    sumar = restar = dividir = false;
}

function division() {
    realizarOperacion();
    dividir = true;
    sumar = restar = multiplicar = false;
}

// Indicamos mediante condicionales cada cálculo, con respecto al video de guia, usamos parseFloat(cifra) para no tener conflictos con decimales.
function realizarOperacion() {
    if (cifra === "") return; // Evita operar si cifra está vacía

    if (p_operacion) { // Comprobamos primero que se introduzca un valor antes de realizar una operación, para evitar que se ejecuten los operadores sin valores
        acumulado = parseFloat(cifra);
        p_operacion = false;
    } else {
        if (sumar) {
            acumulado += parseFloat(cifra); // con +=. asignramos al valor indicado según operador
        } else if (restar) {
            acumulado -= parseFloat(cifra);
        } else if (multiplicar) {
            acumulado *= parseFloat(cifra);
        } else if (dividir) {
            acumulado /= parseFloat(cifra);
        }
    }

    document.getElementById("display").value = acumulado;
    cifra = ""; // Resetea cifra para el próximo número
}

function resultado() {
    realizarOperacion();
    p_operacion = true; // Permite empezar una nueva serie de operaciones
    // Restablece todos los booleanos de operación a false
    sumar = restar = multiplicar = dividir = false;
    cifra = acumulado.toString(); // Para continuar desde el resultado actual si se desea
}

// Para el botón de reseteo, creamos función que devuelva todo al comienzo
function reseteo() {
    document.getElementById("display").value = 0;
    acumulado = 0;
    cifra = "";
    p_operacion = true;
    sumar = restar = multiplicar = dividir = false;
}
