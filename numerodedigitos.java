import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        String numeroComoString = Integer.toString(numero);

        int cantidadDeDigitos = numeroComoString.length();

        System.out.println("El número de dígitos en " + numero + " es: " + cantidadDeDigitos);

        scanner.close();
    }
}
