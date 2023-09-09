import java.util.Scanner;

public class MinimoDeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();
        double minimo = numero1;

        if (numero2 < minimo) {
            minimo = numero2;
        }

        if (numero3 < minimo) {
            minimo = numero3;
        }
        System.out.println("El mínimo de los tres números es: " + minimo);
        scanner.close();
    }
}
