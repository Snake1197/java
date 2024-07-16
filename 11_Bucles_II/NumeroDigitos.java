import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroDigitos {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      boolean finish = false;
      do {
         try {
            System.out.println("Ingrese un número entero:");
            long numero = miScanner.nextLong();

            if (numero < Integer.MIN_VALUE || numero > Integer.MAX_VALUE) {
               throw new IllegalArgumentException("El número está fuera del rango permitido para un int.");
            }

            int numeroInt = (int) numero;
            int numeroAbsoluto = Math.abs(numeroInt);
            if (numeroAbsoluto == 0) {
               System.out.println("El número 0 tiene 1 dígito.");
            } else {
               int contador = 0;

               while (numeroAbsoluto > 0) {
                  numeroAbsoluto /= 10;
                  contador++;
               }
               System.out.println("El número " + numeroInt + " tiene " + contador + " dígitos.");
               finish = true;
            }
         } catch (InputMismatchException e) {
            System.out.println("\nSolo puede ingresar valores enteros, intente nuevamente\n");
            miScanner.nextLine();
         } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage() + "\n");
            miScanner.nextLine();
         } catch (Exception e) {
            System.out.println("\nAlgo ocurrió, intente nuevamente\n");
            miScanner.nextLine();
         }
      } while (!finish);
      miScanner.close();
   }
}
