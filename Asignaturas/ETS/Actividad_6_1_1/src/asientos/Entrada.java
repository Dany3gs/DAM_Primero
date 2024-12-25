package asientos;

/**
 * Representa el número de las entradas y la zona a la que pertenece.
 * Cada entrada está asociada a un objeto de la clase Zona, Asiento y Evento, para indicar toda la información
 * de la reserva
 *
 */

public class Entrada {

    // Atributos
    private int numeroEntrada;
    private Zona zona;
    private Asiento asiento;
    private Evento evento;

    // Método constructor
    public Entrada(int numeroEntrada, Zona zona, Asiento asiento, Evento evento) {
        this.numeroEntrada = numeroEntrada;
        this.zona = zona;
        this.asiento = asiento;
        this.evento = evento;
    }

    // Getters
    public int getNumeroEntrada() {
        return numeroEntrada;
    }
    public Zona getZona() {
        return zona;
    }
    public Asiento getAsiento() {
        return asiento;
    }
    public Evento getEvento() {
        return evento;
    }

    // Setters
    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
