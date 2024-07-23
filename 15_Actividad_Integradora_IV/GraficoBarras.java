import java.util.Scanner;

public class GraficoBarras {

   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] numeros = new int[4];

      for (int i = 0; i < 4; i++) {
         while (true) {
            System.out.print("Ingrese un número entre 1 y 20 para la barra " + (i + 1) + ": ");
            try {
               int numero = Integer.parseInt(miScanner.nextLine());
               if (numero < 1 || numero > 20) {
                  System.out.println("El número debe estar entre 1 y 20. Intente de nuevo.");
               } else {
                  numeros[i] = numero;
                  break;
               }
            } catch (NumberFormatException e) {
               System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
         }
      }
      miScanner.close();

      System.out.println("\nGráfico de barras:");
      for (int numero : numeros) {
         System.out.print(numero + " ");
         for (int j = 0; j < numero; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}
