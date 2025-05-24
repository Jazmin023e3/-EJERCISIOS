import java.util.Scanner;

public class ParesConWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int i = 0; // Variable de control

        System.out.println("Números pares entre 0 y " + numero + ":");
        // Usar while para iterar y mostrar los pares
        while (i <= numero) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}