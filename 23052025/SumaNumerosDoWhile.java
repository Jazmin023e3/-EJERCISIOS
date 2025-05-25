import java.util.Scanner;

public class SumaNumerosDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaTotal = 0;
        char continuar;

        do {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            sumaTotal += numero; // Acumula el número en la suma total

            System.out.print("¿Desea ingresar otro número? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("La suma total de los números ingresados es: " + sumaTotal);
        scanner.close();
    }
}