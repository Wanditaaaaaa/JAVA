import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }


