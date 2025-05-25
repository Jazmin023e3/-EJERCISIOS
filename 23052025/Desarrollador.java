// Desarrollador.java
public class Desarrollador implements IProfesion {

    private String nombre;
    private double tarifaPorHora;
    private double horasTrabajadas;

    public Desarrollador(String nombre, double tarifaPorHora, double horasTrabajadas) {
        this.nombre = nombre;
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}