package Ejercicio2;

public abstract class Animal {
    private String nombreAnimal;
    private double peso;

    public Animal(String nombreAnimal, double peso) {
        this.nombreAnimal = nombreAnimal;
        this.peso = peso;
    }

    void comer(){
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombreAnimal='" + nombreAnimal + '\'' +
                ", peso=" + peso +
                '}';
    }
}
