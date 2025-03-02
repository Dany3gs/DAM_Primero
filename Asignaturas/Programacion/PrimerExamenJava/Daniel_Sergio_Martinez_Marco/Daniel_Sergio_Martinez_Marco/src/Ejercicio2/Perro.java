package Ejercicio2;

public class Perro extends Viviparo implements Raza{
    private String coloPelo;

    public Perro(String nombreAnimal, double peso, String coloPelo) {
        super(nombreAnimal, peso);
        this.coloPelo = coloPelo;
    }

    public String getColoPelo() {
        return coloPelo;
    }

    public void setColoPelo(String coloPelo) {
        this.coloPelo = coloPelo;
    }

    public void ladrar(){

    }

    @Override
    public String toString() {
        return "Perro{" +
                "coloPelo='" + coloPelo + '\'' +
                '}';
    }
}
