import java.util.InputMismatchException;
import java.util.Scanner;

public class RedondeoNumeros {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingres un número entero");
         double numero = miScanner.nextDouble();
         double numeroRedondeado = Math.round(numero);
         System.out.println("El número absoluto es: " + numeroRedondeado);
      } catch (InputMismatchException e) {
         System.out.println("Solo puede ingresar valores numéricos");
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la extracción.");
      }
      miScanner.close();
   }
}
