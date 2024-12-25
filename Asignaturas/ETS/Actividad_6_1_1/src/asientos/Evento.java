package asientos;

/**
 * Representa los datos del evento, Nombre, fecha y hora.
 */

public class Evento {

    // Atributo
    private String nombreEvento;
    private String fecha;
    private String hora;

    // Método constructor
    public Evento(String nombreEvento, String fecha, String hora) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters
    public String getNombreEvento() {
        return nombreEvento;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHora() {
        return hora;
    }

    // Setters
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
}
