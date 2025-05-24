import java.util.Scanner;

public class ParesEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el primer número entero
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();
        
        // Solicitar el segundo número entero
        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        // Definir los límites para recorrer entre los números
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);
        
        int contador = inicio;
        System.out.println("Los números pares entre " + inicio + " y " + fin + " son:");
        
        while (contador <= fin) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }
        
        scanner.close();
    }
}