import java.util.Scanner;

public class ComparacionCadenas {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese la primera palabra:");
         String palabra1 = miScanner.nextLine();

         System.out.println("Ingrese la segunda palabra:");
         String palabra2 = miScanner.nextLine();

         if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
         } else {
            System.out.println("Las palabras son diferentes.");
         }
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error.");
         System.out.println(e.getMessage());
      }
      miScanner.close();

   }
}
