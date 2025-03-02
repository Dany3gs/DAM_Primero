package Ejercicio5;

import java.util.Arrays;

public class ContarCadenas {
    private String palabra;

    public ContarCadenas(String palabra) {
        this.palabra = palabra;
    }

    public void contarVocales(){
        int cantidadVocales = 0;
        String vocales = "aeiouAEIOU";
        for(char letra : palabra.toCharArray()){
            if (vocales.indexOf(letra) != -1){
                cantidadVocales++;
            }
        }
        System.out.println("La palabra contiene " + cantidadVocales + " vocales");
    }

    public void contarConsonantes(){
        int consonantes = 0;
        String vocales = "aeiouAEIOU";
        for(char letra : palabra.toCharArray()){
            if (Character.isLetter(letra) && vocales.indexOf(letra) == -1){
                consonantes++;
            }
        }

        System.out.println("La palabra contiene " + consonantes+ " consonantes");
    }

    public void tamanioCaneda(){
        int tamanio = 0;
        for(char letra : palabra.toCharArray()){
            if (Character.isLetter(letra)){
                tamanio++;
            }
        }
        System.out.println("El tamaño de la palabra es de " + tamanio + " letras.");
    }

    public void mayusculaCadena(){
        System.out.println("En mayúscula es; " + palabra.toUpperCase());
    }
}
