import java.util.Scanner;

public class EspaciosEnBlanco {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una frase con espacios en blanco al principio y al final:");
         String frase = miScanner.nextLine();

         String fraseSinEspacios = frase.trim();

         System.out.println("La frase sin espacios en blanco al principio y al final es:");
         System.out.println(fraseSinEspacios);
      } catch (Exception e) {
         System.out.println("Ups! Ocurrió un error.");
      }
      miScanner.close();

   }
}
