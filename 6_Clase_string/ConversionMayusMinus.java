import java.util.Scanner;

public class ConversionMayusMinus {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto para convertir:");
         String cadena = miScanner.nextLine();
         String cadenaMayus = cadena.toUpperCase();
         String cadenaMinus = cadena.toLowerCase();
         System.out.println("La cadena en mayúsculas es: " + cadenaMayus);
         System.out.println("La cadena en minúscula es: " + cadenaMinus);
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la conversión.");
      }
      miScanner.close();
   }
}
