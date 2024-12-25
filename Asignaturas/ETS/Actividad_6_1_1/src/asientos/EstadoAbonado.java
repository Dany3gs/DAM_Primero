package asientos;

/**
 * Representa el estado de los abonados, si están activos o no.
 * Se asocia a un objeto de la clase Usuario para comprobar si es familiar.
 */

public class EstadoAbonado {

    // Atributo
    private boolean activo;
    private boolean familiar;

    // Método constructor
    public EstadoAbonado(boolean activo, boolean familiar) {
        this.activo = activo;
        this.familiar = familiar;

    }

    // Getters
    public boolean getEstado() {
        return activo;
    }
    public boolean getFamiliar() {
        return familiar;
    }

    // Setters
    public void setEstado(boolean activo) {
        this.activo = activo;
    }
    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }


    public boolean esFamiliar() {
        return familiar;
    }

    public boolean estaActivo() {
        return activo;
    }
}
