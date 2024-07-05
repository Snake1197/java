import java.util.Scanner;

public class ConcatenacionCadenas {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese su nombre:");
         String nombre = miScanner.nextLine();
         System.out.println("Ingrese su apellido");
         String apellido = miScanner.nextLine();
         System.out.println("Su nombre completo es: " + nombre + ' ' + apellido);
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió.");
      }
      miScanner.close();
   }
}
