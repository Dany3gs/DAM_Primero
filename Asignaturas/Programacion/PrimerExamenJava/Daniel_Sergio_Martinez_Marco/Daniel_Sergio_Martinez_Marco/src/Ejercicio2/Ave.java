package Ejercicio2;

public class Ave extends Oviparo{
    private int numeroHuevos;

    public Ave(String nombreAnimal, double peso, int numeroHuevos) {
        super(nombreAnimal, peso);
        this.numeroHuevos = numeroHuevos;
    }

    public Ave(String nombreAnimal, double peso) {
        super(nombreAnimal, peso);
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "numeroHuevos=" + numeroHuevos +
                '}';
    }

    @Override
    public void ponerHuevos() {
        super.ponerHuevos();
    }

    @Override
    void comer() {
        super.comer();
    }
}
