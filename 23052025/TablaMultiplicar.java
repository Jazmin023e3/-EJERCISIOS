import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicitar número al usuario y validar
        do {
            System.out.print("Ingrese un número natural positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Por favor, ingrese un número mayor que cero.");
            }
        } while (numero <= 0);

        mostrarTablaMultiplicar(numero);
        scanner.close();
    }

    // Método que muestra la tabla de multiplicar
    public static void mostrarTablaMultiplicar(int num) {
        System.out.println("Tabla de multiplicar de " + num + ":");
        for (int i = 1; i <= 12; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}