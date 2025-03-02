package Ejercicio2;

public class Pelicano extends Ave{
    private double tiempoVueloMar;

    public Pelicano(String nombreAnimal, double peso, int numeroHuevos, double tiempoVueloMar) {
        super(nombreAnimal, peso, numeroHuevos);
        this.tiempoVueloMar = tiempoVueloMar;
    }

    public Pelicano(String nombreAnimal, double peso, double tiempoVueloMar) {
        super(nombreAnimal, peso);
        this.tiempoVueloMar = tiempoVueloMar;
    }

    public double getTiempoVueloMar() {
        return tiempoVueloMar;
    }

    public void setTiempoVueloMar(double tiempoVueloMar) {
        this.tiempoVueloMar = tiempoVueloMar;
    }

    @Override
    public String toString() {
        return "Pelicano{" +
                "tiempoVueloMar=" + tiempoVueloMar +
                '}';
    }

    @Override
    public void setNumeroHuevos(int numeroHuevos) {
        super.setNumeroHuevos(numeroHuevos);
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
