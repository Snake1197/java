import java.util.Scanner;

public class ReemplazoCaracteres {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto:");
         String cadena = miScanner.nextLine();
         System.out.println("Ingrese el caracter que desea reemplazar:");
         String caracter = miScanner.nextLine();
         if (caracter.length() != 1) {
            miScanner.close();
            throw new IllegalArgumentException("Por favor ingrese solo un único carácter que desee reemplazar.");
         }
         System.out.println("Ingrese el valor por el cual debe ser reemplazado:");
         String reemplazo = miScanner.nextLine();
         if (reemplazo.length() != 1) {
            miScanner.close();
            throw new IllegalArgumentException("Por favor ingrese solo un único carácter para realizar el reemplazo.");
         }
         String cadenaReemplazo = cadena.replace(caracter, reemplazo);
         System.out.println("El resultado del remplazo es: " + cadenaReemplazo);
      } catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en el reemplazo.");
      }
      miScanner.close();
   }
}
