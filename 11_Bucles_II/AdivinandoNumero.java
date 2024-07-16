import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinandoNumero {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int numeroAleatorio = (int) (Math.random() * 20) + 1;
      boolean acierto = false;
      String mensaje;
      int intento = 1;
      do {
         try {
            System.out.println("Adivina el número, ingrese su posible respuesta (solo números enteros)");
            int respuesta = miScanner.nextInt();
            if (respuesta != numeroAleatorio) {
               mensaje = numeroAleatorio < respuesta ? "El número ingresado es mayor a la respuesta correcta\n\n"
                     : "El número ingresado es menor a la respuesta correcta\n\n";
            } else {
               mensaje = "Has ganado!! Por esta vez\n\nNúmero de intentos realizados: " + intento;
               acierto = true;
            }
            System.out.println(mensaje);
            intento++;
         } catch (InputMismatchException e) {
            System.out.println("\nSolo puede ingresar valores enteros, intente nuevamente\n");
            miScanner.next();
         }
      } while (!acierto);
      miScanner.close();
   }
}
