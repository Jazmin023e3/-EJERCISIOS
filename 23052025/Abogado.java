// Abogado.java
public class Abogado implements IProfesion {

    private String nombre;
    private double tarifaPorCaso;
    private int numeroCasos;

    public Abogado(String nombre, double tarifaPorCaso, int numeroCasos) {
        this.nombre = nombre;
        this.tarifaPorCaso = tarifaPorCaso;
        this.numeroCasos = numeroCasos;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorCaso * numeroCasos;
    }
}