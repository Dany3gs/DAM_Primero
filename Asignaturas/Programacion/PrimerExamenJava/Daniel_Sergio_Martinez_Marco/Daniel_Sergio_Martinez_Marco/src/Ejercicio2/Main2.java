package Ejercicio2;

public class Main2 {
    public static void main(String[] args) {


        Ave ave1 = new Ave("Ave1", 4.5, 5);
        Delfin delfin1 = new Delfin("Delfi", 40.00);
        Oviparo oviparo1 = new Oviparo("Tobi", 23.40);
        Ovoviviparo ovoviviparo1 = new Ovoviviparo("Ovovo", 14.3, 6.5);
        Pelicano pelicano1 = new Pelicano("Pelicano1", 20.3, 20.4);
        Perro perro1 = new Perro("Faican", 24.90, "Blanco y negro");
        Tiburon tiburon2 = new Tiburon("Shark", 50.4, 2,4);
        Viviparo viviparo1 = new Viviparo("Viviflow", 15.50);

        System.out.println("Los animales son:");
        System.out.println(ave1);
        System.out.println(delfin1);
        System.out.println(oviparo1);
        System.out.println(ovoviviparo1);
        System.out.println(pelicano1);
        System.out.println(perro1);
        System.out.println(tiburon2);
        System.out.println(viviparo1);



    }

}
