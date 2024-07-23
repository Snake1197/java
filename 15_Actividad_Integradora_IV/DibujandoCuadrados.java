import java.util.Scanner;

public class DibujandoCuadrados {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int medida = 0;

      while (true) {
         System.out.print("Por favor, ingrese el tamaño del cuadrado (entero positivo): ");
         try {
            medida = Integer.parseInt(miScanner.nextLine());
            if (medida <= 0) {
               System.out.println("El tamaño debe ser un entero positivo. Intente de nuevo.");
            } else {
               break;
            }
         } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
         }
      }
      miScanner.close();
      for (int i = 0; i < medida; i++) {
         for (int j = 0; j < medida; j++) {
            if (i == 0 || i == medida - 1 || j == 0 || j == medida - 1) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
}
