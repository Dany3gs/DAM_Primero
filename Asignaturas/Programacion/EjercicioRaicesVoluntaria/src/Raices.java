public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Formula ecuación 2º grado: (-b+√((b^2)-(4*a*c)))/(2*a)
    //Segunda opción             (-b-√((b^2)-(4*a*c)))/(2*a)
    //obtenerRaises(): imprime las 2 posibles soluciones
    public void obtenerRaices(){
        if (tieneRaices()) {
            double raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las soluciones son: raíz 1 = " + raiz1 + " y raíz 2 = " + raiz2);
        } else {
            System.out.println("No tiene dos raíces reales distintas.");
        }
    }

    //obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            double unicaRaiz = (double) -b / (2 * a);
            System.out.println("La única solución es: una raíz = " + unicaRaiz);
        } else {
            System.out.println("No tiene una única raíz real.");
        }
    }

    //getDiscriminante(): devuelve el valor del discriminante (double)
    public double getDiscriminante(){
        return Math.pow(b, 2) - (4 * a * c);
    }

    //tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(){
        return getDiscriminante() > 0;
    }
    //tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }

    //calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.
    public void calcular(){
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene soluciones reales.");
        }
    }
}
