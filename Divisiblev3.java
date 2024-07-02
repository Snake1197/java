import java.util.Scanner;

public class Divisiblev3 {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   System.out.print("Por favor, ingrese un número: ");
   String entrada = scanner.nextLine();

   try {
      int numero = Integer.parseInt(entrada);

      if (numero % 3 == 0 && numero % 5 == 0) {
      System.out.println("El número es divisible por 3 y por 5.");
      } else if (numero % 3 == 0) {
      System.out.println("El número es divisible por 3.");
      } else if (numero % 5 == 0) {
      System.out.println("El número es divisible por 5.");
      } else {
      System.out.println("El número no es divisible ni por 3 ni por 5.");
      }
   } catch (NumberFormatException e) {
      System.out.println("El valor ingresado no es un número válido.");
   } finally {

   scanner.close();
   }
   }
}