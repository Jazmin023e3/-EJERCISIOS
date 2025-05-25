import java.util.Scanner;

public class SumaRepetitiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Ingrese el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = scanner.nextInt();

            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);

            System.out.print("¿Desea realizar otra suma? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Programa terminado. ¡Hasta luego!");
        scanner.close();
    }
}