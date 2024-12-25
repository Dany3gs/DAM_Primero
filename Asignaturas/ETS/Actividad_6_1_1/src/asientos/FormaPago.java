package asientos;

/**
 * Representa las formas de pago (tarjeta o efectivo).
 * Se crea atributo que indique si está disponible el método de pago por TPV
 * Se asocia a un objeto de la clase TPV, para vincular con que tpv fue pagado.
 */

public class FormaPago {

    // Atributo
    private String formaPago; // tarjeta o efectivo
    private boolean disponible; // disponibilidad de los tpv
    private TPV tpvAsociado;

    // Método constructor
    public FormaPago(String formaPago, boolean disponible, TPV tpvAsociado) {
        this.formaPago = formaPago;
        this.disponible = disponible;
        this.tpvAsociado = tpvAsociado;
    }

    // Getters
    public String getFormaPago() {
        return formaPago;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public TPV getTpvAsociado() {
        return tpvAsociado;
    }

    // Setters
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setTpvAsociado(TPV tpvAsociado) {
        this.tpvAsociado = tpvAsociado;
    }
}
