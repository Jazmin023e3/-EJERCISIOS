// MainPersonal.java
public class MainPersonal {
    public static void main(String[] args) {
        // No podemos crear una instancia directamente de la clase abstracta Personal:
        // Personal personal = new Personal("Nombre", 1); // Esto daría un error de compilación

        // Creamos una instancia de la clase concreta Empleado:
        Empleado empleado1 = new Empleado("Ana Pérez", 101, "Ventas", 1500.0);
        empleado1.registrarHoras(10, 25.0); // Registramos 10 horas extras a una tarifa de 25.0 por hora

        // Llamamos a los métodos implementados:
        empleado1.Registrar();
        double sueldoEmpleado1 = empleado1.calcularSueldo();
        System.out.println("El sueldo de " + empleado1.getNombre() + " es: $" + sueldoEmpleado1);

        Empleado empleado2 = new Empleado("Carlos López", 102, "Marketing", 1200.0);
        empleado2.Registrar();
        double sueldoEmpleado2 = empleado2.calcularSueldo();
        System.out.println("El sueldo de " + empleado2.getNombre() + " es: $" + sueldoEmpleado2);
    }
}