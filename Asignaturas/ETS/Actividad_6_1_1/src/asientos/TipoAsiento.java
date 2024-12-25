package asientos;

/**
 * Representa los tipos de asientos creados y su precio.
 * Se asocia al objeto zona de la clase Zona para vincular precios por zonas.
 */

public class TipoAsiento {

    // Atributos
    private String nombreTipo;
    private double precio;
    private Zona zona;

    // Método constructor
    public TipoAsiento(String nombreTipo, double precio, Zona zona) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.zona = zona;
    }

    // Getters
    public String getNombreTipo() {
        return nombreTipo;
    }
    public double getPrecio() {
        return precio;
    }
    public Zona getZona() {
        return zona;
    }

    // Setters
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
