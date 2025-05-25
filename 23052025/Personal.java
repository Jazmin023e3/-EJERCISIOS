// Personal.java
public abstract class Personal {

    private String nombre;
    private int id;

    public Personal(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // Método abstracto para registrar información
    public abstract void Registrar();

    // Método abstracto para calcular el sueldo
    public abstract double calcularSueldo();
}