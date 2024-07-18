import java.util.Scanner;

public class VerificarCadenaNumVal {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      boolean conversionExitosa = false;
      while (!conversionExitosa) {
         try {
            System.out.println("Ingrese un valor para convertir a decimal:");
            String input = miScanner.nextLine();
            System.out.println("El valor convertido es: " + Double.valueOf(input));
            conversionExitosa = true;
         } catch (NumberFormatException e) {
            System.out.println("No es posible realizar la conversión, intentar nuevamente!\n");
         } catch (Exception e) {
            System.out.println("Algo ocurrió, intente nuevamente!\n");
         }
      }
      miScanner.close();
   }
}
