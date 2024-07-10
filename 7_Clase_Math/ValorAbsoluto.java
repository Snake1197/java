import java.util.InputMismatchException;
import java.util.Scanner;

public class ValorAbsoluto {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingres un número entero");
         int numero = miScanner.nextInt();
         int numeroAbsoluto = Math.abs(numero);
         System.out.println("El número absoluto es: " + numeroAbsoluto);
      } catch (InputMismatchException e) {
         System.out.println("Solo puede ingresar valores enteros");
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la operación.");
      }
      miScanner.close();
   }
}
