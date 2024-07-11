import java.util.InputMismatchException;
import java.util.Scanner;

public class CopiandoElementos {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] arrayOriginal = { 1, 2, 3 };
      int[] arrayExtendido = new int[5];
      System.arraycopy(arrayOriginal, 0, arrayExtendido, 2, 2);
      try {
         System.out.println("Ingres un primer número:");
         arrayExtendido[0] = miScanner.nextInt();
         System.out.println("Ingrese un segundo número:");
         arrayExtendido[1] = miScanner.nextInt();
         System.out.println("El contenido del nuevo array es:");
         System.out.println(arrayExtendido[0]);
         System.out.println(arrayExtendido[1]);
         System.out.println(arrayExtendido[2]);
         System.out.println(arrayExtendido[3]);
         System.out.println(arrayExtendido[4]);
      } catch (InputMismatchException e) {
         System.out.println("Solo debe ingresar números enteros");
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió.");
      }
      miScanner.close();
   }
}
