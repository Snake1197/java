import java.util.Scanner;

public class ConversionCadenaEntero {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      try {
         System.out.println("Ingrese el valor que desea convertir a un número entero");
         String valor = miScanner.nextLine();
         int entero = Integer.parseInt(valor);
         System.out.println("La conversión fue realizada con éxito, el valor obtenido es: " + entero);
      } catch (NumberFormatException e) {
         System.out.println(
               "Ocurrió un error en la conversión, no es posible convertir a número entero el valor ingresado.");
      } catch (Exception e) {
         System.out.println("Oh no! Algo ocurrió en el proceso, comuníquese con soporte.");
      }
      miScanner.close();

   }
}
