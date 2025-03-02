package Ejercicio2;

public class Tiburon extends Ovoviviparo implements Raza{
        private int numeroHuevos;
        private int tiempoDeEclosion;

    public Tiburon(String nombreAnimal, double peso, double tiempoHuevosVientre, int numeroHuevos) {
        super(nombreAnimal, peso, tiempoHuevosVientre);
        this.numeroHuevos = numeroHuevos;
    }

    public Tiburon(String nombreAnimal, double peso, int numeroHuevos) {
        super(nombreAnimal, peso);
        this.numeroHuevos = numeroHuevos;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    public int getTiempoDeEclosion() {
        return tiempoDeEclosion;
    }

    public void setTiempoDeEclosion(int tiempoDeEclosion) {
        this.tiempoDeEclosion = tiempoDeEclosion;
    }

    @Override
    public String toString() {
        return "Tiburon{" +
                "numeroHuevos=" + numeroHuevos +
                ", tiempoDeEclosion=" + tiempoDeEclosion +
                ", tiempoHuevosVientre=" + tiempoHuevosVientre +
                '}';
    }

    @Override
    public double getTiempoHuevosVientre() {
        return super.getTiempoHuevosVientre();
    }

    @Override
    public void setTiempoHuevosVientre(double tiempoHuevosVientre) {
        super.setTiempoHuevosVientre(tiempoHuevosVientre);
    }

    @Override
    void comer() {
        super.comer();
    }
}
