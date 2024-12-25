package asientos;

/**
 * Representa el estado de los asientos, si están libres, ocupados o reservado.
 */

public class EstadoAsiento {

    // Atributo
    private String estado;


    // Método constructor
    public EstadoAsiento(String estado) {
        this.estado = estado;
    }

    // Getters
    public String getEstado() {
        return estado;
    }

    // Setters
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
