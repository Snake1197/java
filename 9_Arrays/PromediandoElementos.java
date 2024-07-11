import java.util.InputMismatchException;
import java.util.Scanner;

public class PromediandoElementos {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] array = new int[4];
      try {
         System.out.println("Ingrese un número entero:");
         array[0] = miScanner.nextInt();
         System.out.println("Ingrese un segundo número entero:");
         array[1] = miScanner.nextInt();
         System.out.println("Ingrese un tercer número entero:");
         array[2] = miScanner.nextInt();
         System.out.println("Ingrese un cuarto número entero:");
         array[3] = miScanner.nextInt();
         double promedio = (double) (array[0] + array[1] + array[2] + array[3]) / array.length;
         System.out.println("El promedio de los 4 número es:" + promedio);
      } catch (InputMismatchException e) {
         System.out.println("Solo debe ingresar valores numéricos enteros");
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió");
         e.printStackTrace();
      }
      miScanner.close();
   }
}
