package asientos;

/**
 * Representa a la persona que cobró la entrada con su Nombre y forma de contacto.
 * Se asocia al objeto formaPago de la clase FormaPago para vincular con el cobro.
 */

public class Responsable {

    // Atributo
    private String nombre;
    private String contacto;
    private FormaPago formaPago;

    // Método constructor con parámetros
    public Responsable(String nombre, String contacto, FormaPago formaPago) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.formaPago = formaPago;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getContacto() {
        return contacto;
    }
    public FormaPago getFormaPago() {
        return formaPago;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
}
