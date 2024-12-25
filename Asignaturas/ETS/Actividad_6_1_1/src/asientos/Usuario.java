package asientos;

/**
 * Representa los datos necesarios para el ingreso a la aplicación por parte de los usuarios.
 * Se indica si el usuario es familiar o no de un abonado.
 * Se asocia a un objeto de la clase Abonado para comprobar si el abonado está activo o no.
 */

public class Usuario {

    // Atributos
    private String userNombre;
    private String password;
    private Abonado abonado;

    // Método constructor
    public Usuario(String userNombre, String password, Abonado abonado ) {
        this.userNombre = userNombre;
        this.password = password;
        this.abonado = abonado;

    }

    // Getters
    public String getUserNombre() {
        return userNombre;
    }
    public String getPassword() {
        return password;
    }
    public Abonado getAbonado() {
        return abonado;
    }
    public boolean esAbonado() {
        return abonado != null;
    }
    public boolean esFamiliar() {
        return abonado != null && abonado.getEstadoAbonado().esFamiliar();
    }

    // Setters
    public void setUserNombre(String userNombre) {
        this.userNombre = userNombre;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAbonado(Abonado abonado) {
        this.abonado = abonado;
    }
}
