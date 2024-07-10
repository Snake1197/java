import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculandoPotencia {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingres el primer número:");
         int primerNumero = miScanner.nextInt();
         System.out.println("Ingrese el segundo número:");
         int segundoNumero = miScanner.nextInt();
         int potencia = (int) Math.pow(primerNumero, segundoNumero);
         System.out.println("El resultado es: " + potencia);
      } catch (InputMismatchException e) {
         System.out.println("Solo puede ingresar valores enteros");
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la operación.");
      }
      miScanner.close();
   }
}
