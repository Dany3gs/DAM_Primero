package Ejercicio2;

public class Ovoviviparo extends Animal{
    public double tiempoHuevosVientre;

    public Ovoviviparo(String nombreAnimal, double peso, double tiempoHuevosVientre) {
        super(nombreAnimal, peso);
        this.tiempoHuevosVientre = tiempoHuevosVientre;
    }

    public double getTiempoHuevosVientre() {
        return tiempoHuevosVientre;
    }

    public void setTiempoHuevosVientre(double tiempoHuevosVientre) {
        this.tiempoHuevosVientre = tiempoHuevosVientre;
    }

    public Ovoviviparo(String nombreAnimal, double peso) {
        super(nombreAnimal, peso);
    }

    @Override
    public String toString() {
        return "Ovoviviparo{" +
                "tiempoHuevosVientre=" + tiempoHuevosVientre +
                '}';
    }

    @Override
    void comer() {
        super.comer();
    }
}
