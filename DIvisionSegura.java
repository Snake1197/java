import java.util.InputMismatchException;
import java.util.Scanner;

public class DIvisionSegura {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingresa el primer número");
         double num1 = miScanner.nextDouble();
         System.out.println("Ingresa el segundo número");
         double num2 = miScanner.nextDouble();
         double resultado = num1 / num2;
         System.out.println("El resultado de la divisón es: " + resultado);
      } catch (ArithmeticException e) {
         System.out.println("No es posible dividir por cero");
      } catch (InputMismatchException e) {
         System.out.println("Has ingresado un valor no válido");
      } catch (Exception e) {
         System.out.println("Algo ocurrió, vuelva a intentar");
      }
      miScanner.close();
   }
}
