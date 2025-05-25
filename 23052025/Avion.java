// Avion.java
public class Avion extends vehiculo {
    private int numeroMotores;

    public Avion(String modelo, int numeroMotores) {
        super(modelo);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public void moverse() {
        System.out.println("El avión " + getModelo() + " está volando por el cielo.");
    }
}