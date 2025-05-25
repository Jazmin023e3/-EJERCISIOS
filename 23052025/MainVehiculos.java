// MainVehiculos.java
public class MainVehiculos {
    public static void main(String[] args) {
        vehiculo miAutomovil = new Automovil("Sedán", 4);
        vehiculo miBarco = new Barco("Velero", 15.5);
        vehiculo miAvion = new Avion("Boeing 747", 4);

        miAutomovil.moverse(); // Imprimirá: El automóvil Sedán está rodando por la carretera.
        miBarco.moverse();    // Imprimirá: El barco Velero está navegando por el agua.
        miAvion.moverse();    // Imprimirá: El avión Boeing 747 está volando por el cielo.
    }
}