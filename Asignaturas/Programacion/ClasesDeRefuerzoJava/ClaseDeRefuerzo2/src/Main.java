/**
 * Crearemos una clase llamada Serie con las siguientes características:
 *
 *     Sus atributos son título, número de temporadas, entregado, género y creador.
 *     Por defecto, el número de temporadas es de 3 temporadas y entregado false.
 *     El resto de atributos serán valores por defecto según el tipo del atributo.
 *     Los constructores que se implementaran serán:
 *         Un constructor por defecto.
 *         Un constructor con el título y creador. El resto por defecto.
 *         Un constructor con todos los atributos, excepto de entregado.
 *
 *     Los métodos que se implementara serán:
 *         Métodos get de todos los atributos, excepto de entregado.
 *         Métodos set de todos los atributos, excepto de entregado.
 *         Sobrescribe los métodos toString.
 *
 * Crearemos una clase Videojuego con las siguientes características:
 *
 *     Sus atributos son título, horas estimadas, entregado, género y compañia.
 *     Por defecto, las horas estimadas serán de 10 horas y entregado false.
 *     El resto de atributos serán valores por defecto según el tipo del atributo.
 *     Los constructores que se implementaran serán:
 *         Un constructor por defecto.
 *         Un constructor con el título y horas estimadas. El resto por defecto.
 *         Un constructor con todos los atributos, excepto de entregado.
 *
 *     Los métodos que se implementara serán:
 *         Métodos get de todos los atributos, excepto de entregado.
 *         Métodos set de todos los atributos, excepto de entregado.
 *         Sobrescribe los métodos toString.
 *
 * Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común,
 * por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
 *
 *     entregar(): cambia el atributo prestado a true.
 *     devolver(): cambia el atributo prestado a false.
 *     isEntregado(): devuelve el estado del atributo prestado.
 *
 * Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:
 *
 *     Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
 *     Genera un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
 *     Entrega algunos Videojuegos y Series con el método entregar().
 *     Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
 *     Por último, indica el Videojuego tiene más horas estimadas y la serie con más temporadas.
 *     Muéstralos en pantalla con toda su información (utiliza el método toString()).
 */
public class Main {
    public static void main(String[] args) {

    }
}