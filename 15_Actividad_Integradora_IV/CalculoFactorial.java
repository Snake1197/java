import java.util.Scanner;

public class CalculoFactorial {

   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int number = -1;

      while (true) {
         System.out.print("Por favor, ingrese un número entero positivo: ");
         try {
            number = Integer.parseInt(miScanner.nextLine());
            if (number < 0) {
               System.out.println("El número debe ser positivo. Intente de nuevo.");
            } else {
               break;
            }
         } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
         }
      }
      miScanner.close();

      long factorial = 1;
      int i = 1;
      do {
         factorial *= i;
         i++;
      } while (i <= number);

      System.out.println("El factorial de " + number + " es " + factorial);
   }
}
