import java.util.Scanner;

public class Fibonacci {

   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int position = -1;

      // Solicitar al usuario ingresar una posición
      while (true) {
         System.out.println("Por favor, ingrese una posición en la serie de Fibonacci (entero no negativo): ");
         try {
            position = Integer.parseInt(miScanner.nextLine());
            if (position < 0) {
               System.out.println("La posición debe ser un entero no negativo. Intente de nuevo.");
            } else {
               break;
            }
         } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
         }
      }
      miScanner.close();
      // Calcular el valor de Fibonacci en la posición dada
      long fibonacciValue = fibonacci(position);

      // Imprimir el resultado
      System.out.println("El valor de Fibonacci en la posición " + position + " es " + fibonacciValue);
   }

   // Método para calcular el valor de Fibonacci en una posición dada
   public static long fibonacci(int n) {
      if (n == 0) {
         return 0;
      } else if (n == 1) {
         return 1;
      } else {
         long a = 0, b = 1, c;
         for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
         }
         return b;
      }
   }
}
