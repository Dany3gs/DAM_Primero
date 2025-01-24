/**
 * Haz una clase llamada Persona que siga las siguientes condiciones:
 *
 *     Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos.
 *     Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
 *     Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).
 *     Sexo sera hombre por defecto, usa una constante para ello.
 *     Se implantarán varios constructores:
 *         Un constructor por defecto.
 *         Un constructor con el nombre, edad y sexo, el resto por defecto.
 *         Un constructor con todos los atributos como parámetro.
 *     Los métodos que se implementaran son:
 *         calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve
 *         un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está
 *         por debajo de su peso ideal la función devuelve un 0 y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
 *         la función devuelve un 1. Te recomiendo que utilices constantes para devolver estos valores.
 *             esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 *             comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto,
 *             será H. No será visible al exterior.
 *             toString(): devuelve toda la información del objeto.
 *             generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente.
 *             Este método será invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil.
 *             No será visible al exterior.
 *             Métodos set de cada parámetro, excepto de DNI.
 */


public class Main {
    public static void main(String[] args) {



    }
}