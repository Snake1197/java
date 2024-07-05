import java.util.Scanner;

public class LongitudCadena {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto:");
         String cadena = miScanner.nextLine();
         System.out.println("La longitud de la cadena es: " + cadena.length());
      } catch (Exception e) {
         System.out.println("Ocurrió un error: " + e.getMessage());
      } finally {
         if (miScanner != null) {
            miScanner.close();
         }
      }
   }
}
