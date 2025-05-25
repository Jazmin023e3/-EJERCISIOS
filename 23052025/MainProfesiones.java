// MainProfesiones.java
public class MainProfesiones {
    public static void main(String[] args) {
        Desarrollador desarrollador1 = new Desarrollador("Juan Pérez", 30.0, 160.0);
        Abogado abogado1 = new Abogado("María Gómez", 500.0, 15);

        System.out.println("El sueldo de " + desarrollador1.getNombre() + " es: $" + desarrollador1.calcularSueldo());
        System.out.println("Los ingresos de " + abogado1.getNombre() + " son: $" + abogado1.calcularSueldo());

        // Podemos usar la interfaz como un tipo de referencia (polimorfismo de interfaz)
        IProfesion otroDesarrollador = new Desarrollador("Carlos Ruiz", 35.0, 170.0);
        IProfesion otroAbogado = new Abogado("Laura Vargas", 600.0, 10);

        System.out.println("El sueldo de " + ((Desarrollador) otroDesarrollador).getNombre() + " es: $" + otroDesarrollador.calcularSueldo());
        System.out.println("Los ingresos de " + ((Abogado) otroAbogado).getNombre() + " son: $" + otroAbogado.calcularSueldo());
    }
}