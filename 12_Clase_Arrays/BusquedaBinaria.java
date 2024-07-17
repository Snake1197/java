import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class BusquedaBinaria {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] array = new int[10];
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 100);
      }
      boolean acierto = false;
      do {
         try {
            System.out.println("Ingrese el número entero a buscar:");
            int input = miScanner.nextInt();
            if (Arrays.binarySearch(array, input) > 0) {
               System.out.println("El número existe en el array, en la posición: " + Arrays.binarySearch(array, input));
               acierto = true;
            } else {
               System.out.println("El número ingresado no existe en el array, pruebe con otro número");
            }
         } catch (InputMismatchException e) {
            System.out.println("\nSolo puede buscar número enteros\n");
            miScanner.next();
         } catch (Exception e) {
            System.out.println("\nAlgo ocurrió, intente nuevamente\n");
            miScanner.next();
         }
      } while (!acierto);
      miScanner.close();
   }
}
