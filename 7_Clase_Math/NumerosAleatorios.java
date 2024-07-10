import java.util.Scanner;

public class NumerosAleatorios {

   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         int numeroAleatorio = (int) (Math.random() * 355) + 1;
         System.out.println("El número absoluto es: " + numeroAleatorio);
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error en la operación.");
      }
      miScanner.close();
   }
}