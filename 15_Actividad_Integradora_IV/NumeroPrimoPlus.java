import java.util.Scanner;

public class NumeroPrimoPlus {

   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int cantidad;

      while (true) {
         System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
         try {
            cantidad = Integer.parseInt(miScanner.nextLine());
            if (cantidad <= 0) {
               System.out.println("La cantidad debe ser un entero positivo. Intente de nuevo.");
            } else {
               break;
            }
         } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
         }
      }
      miScanner.close();

      System.out.println("\nLos primeros " + cantidad + " números primos son:");
      int contador = 0;
      int numero = 2;

      while (contador < cantidad) {
         if (esPrimo(numero)) {
            System.out.print(numero + " ");
            contador++;
         }
         numero++;
      }
   }

   public static boolean esPrimo(int num) {
      if (num <= 1) {
         return false;
      }
      if (num <= 3) {
         return true;
      }
      if (num % 2 == 0 || num % 3 == 0) {
         return false;
      }
      for (int i = 5; i * i <= num; i += 6) {
         if (num % i == 0 || num % (i + 2) == 0) {
            return false;
         }
      }
      return true;
   }
}
