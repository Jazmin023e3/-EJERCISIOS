import java.util.Scanner;

public class CompraConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        // Mostrar opciones de etiquetas
        System.out.println("Elige la etiqueta del producto:");
        System.out.println("1. Verde (5%)");
        System.out.println("2. Roja (10%)");
        System.out.println("3. Azul (15%)");
        System.out.println("4. Dorada (20%)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double porcentajeDescuento = 0;

        // Determinar el porcentaje de descuento según la opción
        switch (opcion) {
            case 1:
                porcentajeDescuento = 5;
                break;
            case 2:
                porcentajeDescuento = 10;
                break;
            case 3:
                porcentajeDescuento = 15;
                break;
            case 4:
                porcentajeDescuento = 20;
                break;
            default:
                System.out.println("Opción inválida.");
                scanner.close();
                return;
        }

        // Calcular el descuento y monto final
        double descuento = montoCompra * porcentajeDescuento / 100;
        double montoPagar = montoCompra - descuento;

        // Mostrar resultados
        System.out.println("Descuento: $" + String.format("%.2f", descuento));
        System.out.println("Monto a pagar: $" + String.format("%.2f", montoPagar));

        scanner.close();
    }
}