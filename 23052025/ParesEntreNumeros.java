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
        
        // Determinar los límites
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);
        
        boolean hayPares = false; // Para verificar si hay pares en el rango
        
        int contador = inicio;
        System.out.println("Los números pares entre " + inicio + " y " + fin + " son:");
        while (contador <= fin) {
            if (esPar(contador)) {
                System.out.println(contador);
                hayPares = true;
            }
            contador++;
        }
        
        if (!hayPares) {
            System.out.println("No hay números pares en este rango.");
        }
        
        scanner.close();
    }
    
    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}