// Vehiculo.java
public class vehiculo {
    private String modelo;

    public vehiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void moverse() {
        System.out.println("El vehículo se está moviendo de forma genérica.");
    }
}