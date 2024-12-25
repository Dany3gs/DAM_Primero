package asientos;

/**
 * Representa las zonas de ubicación de los asientos, así como su cantidad de asientos disponibles.
 */

public class Zona {

    // Atributos
    private String nombre;
    private int capacidad;

    // Método constructor
    public Zona(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getCapacidad() {
        return capacidad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
