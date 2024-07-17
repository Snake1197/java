import java.util.Arrays;
import java.util.Scanner;

public class RellenandoArreglo {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int tamaño = 0;
      int numero = 0;
      boolean entradaValida = false;

      while (!entradaValida) {
         try {
            System.out.println("Ingrese el tamaño del arreglo: ");
            tamaño = miScanner.nextInt();
            if (tamaño <= 0) {
               System.out.println("El tamaño del arreglo debe ser un número positivo.");
            } else {
               entradaValida = true;
            }
         } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero positivo.");
            miScanner.next();
         }
      }

      entradaValida = false;

      while (!entradaValida) {
         try {
            System.out.println("Ingrese el número entero con el que quiere rellenar el arreglo: ");
            numero = miScanner.nextInt();
            entradaValida = true;
         } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            miScanner.next();
         }
      }

      int[] arreglo = new int[tamaño];

      Arrays.fill(arreglo, numero);

      System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
      miScanner.close();
   }
}
