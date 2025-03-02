package Ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        String[] cadenas = new String[]{"coches", "ambulancia", "casas", "suburbio",
                "submarino", "rosas", "saltamontes"};
        int contador = 0;
        for (int i = 0; i < cadenas.length; i++) {

            if (cadenas[i].endsWith("s")){

                System.out.println(cadenas[i]);
                contador++;
            }
        }
        System.out.println("son " + contador + " palabras");
    }

    //falto el contador
}
