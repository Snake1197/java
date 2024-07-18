import java.util.Scanner;

public class VerificarCadenaLetras {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Introduce una cadena:");
      String input = scanner.nextLine();

      boolean soloLetras = true;

      for (int i = 0; i < input.length(); i++) {
         if (!Character.isLetter(input.charAt(i))) {
            soloLetras = false;
            break;
         }
      }

      if (soloLetras) {
         System.out.println("La cadena contiene solo letras.");
      } else {
         System.out.println("La cadena no contiene solo letras.");
      }

      scanner.close();
   }
}
