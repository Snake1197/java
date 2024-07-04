import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConManejoExcepciones {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese el primer número");
         double num1 = miScanner.nextDouble();
         System.out.println("Ingrese el segundo número");
         double num2 = miScanner.nextDouble();
         double resultado = num1 - num2;
         System.out.println("El resultado de la resta es: " + resultado);
      } catch (InputMismatchException e) {
         System.out.println("El valor ingresado no es válido");
      } catch (Exception e) {
         System.out.println("Ups! No eres tú, somos nosotros. Intenta más tarde");
      }
      miScanner.close();
   }
}
