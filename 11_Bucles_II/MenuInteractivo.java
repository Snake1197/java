import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuInteractivo {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      boolean sesionActive = true;
      String respuesta;
      while (sesionActive == true) {
         try {
            System.out.println(
                  "Bienvenido!\n1. Comprar producto.\n2. Realizar devolución.\n3. Ver mis pedidos.\n4. Preguntas frecuentes.\n5. Salir.\n\nIngrese la opción que desea realizar:");
            int opcionElegida = miScanner.nextInt();
            if (opcionElegida == 5) {
               respuesta = "Salir";
               sesionActive = false;
            } else {
               respuesta = opcionElegida == 1 ? "Comprar producto"
                     : opcionElegida == 2 ? "Realizar devolución"
                           : opcionElegida == 3 ? "Ver mi pedidos" : "Preguntas frecuentes";
            }
            System.out.println("La opción elegida fue: " + respuesta);

         } catch (InputMismatchException e) {
            System.out.println("\nSolo puede ingresar valores enteros, intente nuevamente\n");
            miScanner.next();
         }
      }
      miScanner.close();
   }
}
