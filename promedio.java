public class CalculoPromedio {
    public static void main(String[] args) {
        double[] numeros = { 5.5, 7.2, 3.8, 9.1, 2.4 };

        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = suma / numeros.length;
        System.out.println("El promedio de los números es: " + promedio);
    }
}
