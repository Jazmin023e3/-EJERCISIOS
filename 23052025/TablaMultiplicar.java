import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar número al usuario
        System.out.print("Ingrese un número natural: ");
        int numero = scanner.nextInt();
        
        // Validar que sea un número natural
        if (numero >= 0) {
            mostrarTablaMultiplicar(numero);
        } else {
            System.out.println("Por favor, ingrese un número natural válido.");
        }
        
        scanner.close();
    }

    // Método que muestra la tabla de multiplicar
    public static void mostrarTablaMultiplicar(int num) {
        System.out.println("Tabla de multiplicar de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}