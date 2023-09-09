import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }


        scanner.close();
    }
}
