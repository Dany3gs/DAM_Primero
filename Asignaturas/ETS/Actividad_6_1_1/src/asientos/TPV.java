package asientos;

/**
 * Representa la información de id de los tpv y su ubicación.
 */

public class TPV {

    // Atributos
    private String idTPV;
    private String ubicacion;

    // Método constructor
    public TPV(String idTPV, String ubicacion) {
        this.idTPV = idTPV;
        this.ubicacion = ubicacion;
    }

    // Getters
    public String getIdTPV() {
        return idTPV;
    }
    public String getUbicacion() {
        return ubicacion;
    }

    // Setters
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public void setIdTPV(String idTPV) {
        this.idTPV = idTPV;
    }
}
