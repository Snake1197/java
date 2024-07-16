import java.util.Scanner;

public class ValidacionContraseña {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      String contraseña = "secreto";
      boolean acierto = false;
      do {
         try {
            System.out.println("Ingrese la contraseña:");
            String input = miScanner.nextLine();
            if (input.equals(contraseña)) {
               System.out.println("Contraseña correcta");
               acierto = true;
            } else {
               System.out.println("Contraseña incorrecta, intente nuevamente");
            }
         } catch (Exception e) {
            System.out.println("\nAlgo ocurrió, intente nuevamente\n");
            miScanner.next();
         }
      } while (!acierto);
      miScanner.close();
   }
}
