// Barco.java
public class Barco extends vehiculo {
    private double eslora;

    public Barco(String modelo, double eslora) {
        super(modelo);
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public void moverse() {
        System.out.println("El barco " + getModelo() + " está navegando por el agua.");
    }
}
