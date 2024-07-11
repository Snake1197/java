import java.util.InputMismatchException;
import java.util.Scanner;

public class EncontrandoMaximo {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] array = new int[5];
      try {
         System.out.println("Ingrese un número entero:");
         array[0] = miScanner.nextInt();
         System.out.println("Ingrese un segundo número entero:");
         array[1] = miScanner.nextInt();
         System.out.println("Ingrese un tercer número entero:");
         array[2] = miScanner.nextInt();
         System.out.println("Ingrese un cuarto número entero:");
         array[3] = miScanner.nextInt();
         System.out.println("Ingrese un quinto número entero:");
         array[4] = miScanner.nextInt();
         int numMayor = array[0];
         // Método usando bucle

         /*
          * for (int i = 0; i < array.length; i++) {
          * if (numMayor < array[i]) {
          * numMayor = array[i];
          * }
          * }
          */
         // Método usando solo ternarias

         numMayor = numMayor < array[1] ? array[1] : numMayor;
         numMayor = numMayor < array[2] ? array[2] : numMayor;
         numMayor = numMayor < array[3] ? array[3] : numMayor;
         numMayor = numMayor < array[4] ? array[4] : numMayor;

         System.out.println("El número mayor es:" + numMayor);
      } catch (InputMismatchException e) {
         System.out.println("Solo debe ingresar valores numéricos enteros");
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió");
         e.printStackTrace();
      }
      miScanner.close();
   }
}
