package asientos;

/**
 * Representa un asiento numerado dentro de una zona.
 * Cada asiento está asociado a un objeto de la clase EstadoAsiento que indica su estado actual
 * (por ejemplo, libre, ocupado o reservado).
 */

public class Asiento {

    // Atributos
    private int numero;
    private EstadoAsiento estado;

    // Método constructor
    public Asiento(int numero, EstadoAsiento estado) {
        this.numero = numero;
        this.estado = estado;
    }

    // Getters
    public int getNumero() {
        return numero;
    }
    public EstadoAsiento getEstado() {
        return estado;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }
}
