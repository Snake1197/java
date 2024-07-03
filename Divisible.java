import java.util.Scanner;

public class Divisible {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      System.out.println("Ingresa un número");
      int numero = miScanner.nextInt();
      if (numero % 5 != 0 && numero % 3 != 0) {
         System.out.println("El número no es divisble por 5 o por 3");
      } else if (numero % 5 == 0 && numero % 3 == 0) {
         System.out.println("El número es divisble por 5 y por 3");
      } else if (numero % 5 == 0) {
         System.out.println("El número es divisble por 5");
      } else if (numero % 3 == 0) {
         System.out.println("El número es divisble por 3");
      }

      miScanner.close();
   }
}
