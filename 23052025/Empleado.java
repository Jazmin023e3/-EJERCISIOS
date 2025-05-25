// Empleado.java
public class Empleado extends Personal {

    private String departamento;
    private double salarioBase;
    private double horasTrabajadas;
    private double tarifaPorHora;

    public Empleado(String nombre, int id, String departamento, double salarioBase) {
        super(nombre, id);
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = 0; // Inicialmente
        this.tarifaPorHora = 0;   // Inicialmente
    }

    public void registrarHoras(double horas, double tarifa) {
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }

    @Override
    public void Registrar() {
        System.out.println("Registrando al empleado: " + getNombre() + " con ID: " + getId() + " del departamento de " + departamento);
        // Aquí iría la lógica para guardar la información del empleado en una base de datos, archivo, etc.
    }

    @Override
    public double calcularSueldo() {
        if (horasTrabajadas > 0 && tarifaPorHora > 0) {
            return salarioBase + (horasTrabajadas * tarifaPorHora);
        } else {
            return salarioBase;
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}