package asientos;

/**
 * Representa los datos del abonado, su nombre y número de abonado.
 * Se asocia con objeto de la clase EstadoAbonado para comprobar si tiene o no activo el abono.
 * Se crea atributo final de númeroAbonado para que no se pueda modificar, empezando en 1 e
 * incrementando cuando se cree nuevo abonado, no se crea el setter para que no pueda ver error de
 * modificación.
 * */

public class Abonado {

    // Atributos
    private String nombre;
    private final int numeroAbono;
    private EstadoAbonado estadoAbonado;
    private static int contadorAbonos = 1;

    // Método constructor
    public Abonado(String nombre, EstadoAbonado estadoAbonado) {
        this.nombre = nombre;
        this.numeroAbono = ++contadorAbonos;
        this.estadoAbonado = estadoAbonado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getNumeroAbono() {
        return numeroAbono;
    }
    public EstadoAbonado getEstadoAbonado() {
        return estadoAbonado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstadoAbonado(EstadoAbonado estadoAbonado) {
        this.estadoAbonado = estadoAbonado;
    }
}
