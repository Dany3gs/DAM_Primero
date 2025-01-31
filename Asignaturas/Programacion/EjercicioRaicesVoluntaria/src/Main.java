
/*JESUS GALVAN
21:12
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:

    obtenerRaices(): imprime las 2 posibles soluciones
    obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
    getDiscriminante(): devuelve el valor del discriminante (double)
    tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.

Formula ecuación 2º grado: (-b±√((b^2)-(4*a*c)))/(2*a)*/

public class Main {
    public static void main(String[] args) {
        // Caso 1: Dos raíces reales distintas
        Raices ecuacion1 = new Raices(1, -5, 6);
        System.out.println("Ecuación 1: x² - 5x + 6 = 0");
        ecuacion1.calcular();
        System.out.println("Discriminante: " + ecuacion1.getDiscriminante());
        System.out.println("Tiene dos raíces: " + ecuacion1.tieneRaices());
        System.out.println("Tiene una raíz: " + ecuacion1.tieneRaiz());
        System.out.println();

        // Caso 2: Una raíz real (raíz doble)
        Raices ecuacion2 = new Raices(1, -6, 9);
        System.out.println("Ecuación 2: x² - 6x + 9 = 0");
        ecuacion2.calcular();
        System.out.println("Discriminante: " + ecuacion2.getDiscriminante());
        System.out.println("Tiene dos raíces: " + ecuacion2.tieneRaices());
        System.out.println("Tiene una raíz: " + ecuacion2.tieneRaiz());
        System.out.println();

        // Caso 3: Sin raíces reales
        Raices ecuacion3 = new Raices(1, 2, 3);
        System.out.println("Ecuación 3: x² + 2x + 3 = 0");
        ecuacion3.calcular();
        System.out.println("Discriminante: " + ecuacion3.getDiscriminante());
        System.out.println("Tiene dos raíces: " + ecuacion3.tieneRaices());
        System.out.println("Tiene una raíz: " + ecuacion3.tieneRaiz());
    }
}