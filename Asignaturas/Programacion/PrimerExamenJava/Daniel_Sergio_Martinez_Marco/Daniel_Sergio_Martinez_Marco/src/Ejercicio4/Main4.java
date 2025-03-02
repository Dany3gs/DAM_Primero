package Ejercicio4;

public class Main4 {
    public static void main(String[] args) {

        int[] myArray = new int[20];
        // Faltó rellenar el array

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] += i;
        }

        for (int i = 1; i < myArray.length; i++) {
            int numero =myArray[i];
            if (numero % 5 == 0){
                System.out.println(numero);
            }
        }

    }
}
