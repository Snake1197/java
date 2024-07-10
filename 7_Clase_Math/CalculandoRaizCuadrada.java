import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculandoRaizCuadrada {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese un número positivo: ");
         double numero = miScanner.nextDouble();

         if (numero < 0) {
            System.out.println("El número ingresado es negativo. Por favor, ingrese un número positivo.");
         } else {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
         }
      } catch (InputMismatchException e) {
         System.out.println("Error: Debe ingresar un valor numérico.");
      } catch (Exception e) {
         System.out.println("Ha ocurrido un error inesperado.");
      } finally {
         miScanner.close();
      }
   }
}
