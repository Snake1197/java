import java.util.Arrays;
import java.util.Scanner;

public class CopiandoArreglo {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] array1 = new int[10];
      for (int i = 0; i < array1.length; i++) {
         array1[i] = (int) (Math.random() * 100 + 1);
      }

      System.out.println("Arreglo original con índices:");
      for (int i = 0; i < array1.length; i++) {
         System.out.println("Índice " + i + ": " + array1[i]);
      }

      boolean indicesValidos = false;
      int indiceInicial = 0;
      int indiceFinal = 0;

      while (!indicesValidos) {
         try {
            System.out.println("Ingrese el índice inicial:");
            indiceInicial = miScanner.nextInt();
            System.out.println("Ingrese el índice final:");
            indiceFinal = miScanner.nextInt();

            if (indiceInicial < 0 || indiceInicial >= array1.length ||
                  indiceFinal < 0 || indiceFinal >= array1.length ||
                  indiceInicial > indiceFinal) {
               System.out.println(
                     "Índices inválidos. Asegúrate de que 0 <= índice inicial <= índice final < tamaño del arreglo.");
            } else {
               indicesValidos = true;
            }
         } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingrese números enteros.");
            miScanner.next();
         }
      }

      int[] nuevoArreglo = Arrays.copyOfRange(array1, indiceInicial, indiceFinal + 1);

      System.out.println("Nuevo arreglo copiado: " + Arrays.toString(nuevoArreglo));

      miScanner.close();
   }
}
