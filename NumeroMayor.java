import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        // Determinar el mayor de los tres números usando operador ternario
        int mayor = numero1 >= numero2 ?
                numero1 >= numero3 ? numero1 : numero3 :
                numero2 >= numero3 ? numero2 : numero3;

        System.out.println("El mayor de los tres números es: " + mayor);

        scanner.close();
    }
}