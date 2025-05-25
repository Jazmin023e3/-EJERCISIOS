// Automovil.java
public class Automovil extends vehiculo {
    private int numeroPuertas;

    public Automovil(String modelo, int numeroPuertas) {
        super(modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void moverse() {
        System.out.println("El automóvil " + getModelo() + " está rodando por la carretera.");
    }
}