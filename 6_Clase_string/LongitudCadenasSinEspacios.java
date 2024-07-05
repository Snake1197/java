import java.util.Scanner;

public class LongitudCadenasSinEspacios {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto:");
         String cadena = miScanner.nextLine();

         String cadenaSinEspacios = cadena.replace(" ", "");

         int longitudSinEspacios = cadenaSinEspacios.length();

         System.out.println("La longitud de la cadena sin contar los espacios en blanco es: " + longitudSinEspacios);
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error.");
         System.out.println(e.getMessage());
      }
      miScanner.close();

   }
}
