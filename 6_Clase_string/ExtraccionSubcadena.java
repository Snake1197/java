import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtraccionSubcadena {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto:");
         String cadena = miScanner.nextLine();
         System.out.println("Ingrese la posicion inicial para extraer:");
         Integer posInicial = miScanner.nextInt();
         System.out.println("Ingrese la posicion final para extraer:");
         Integer posFinal = miScanner.nextInt();
         if (posInicial < 0 || posFinal > cadena.length() || posInicial >= posFinal) {
            System.out.println(
                  "Las posiciones deben estar dentro del rango de la cadena y la posición final debe ser mayor que la inicial.");
         } else {
            System.out.println("El resultado de la extracción es: " + cadena.substring(posInicial, posFinal));
         }
      } /*
         * Reemplacé este catch por el if previo.
         * catch (StringIndexOutOfBoundsException e) {
         * System.out.println(
         * "No es posible extraer un valor en el rango indicado, recuerde que la posición final debe ser mayor a la inicial"
         * );
         * }
         */
      catch (InputMismatchException e) {
         System.out.println("Solo puede ingresar valores enteros para las posiciones");
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la extracción.");
      }
      miScanner.close();
   }
}
