import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraSumaAcumulada {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int suma = 0;
      boolean continuar = true;

      do {
         try {
            System.out.println("Ingrese un número entero positivo:");
            int numero = miScanner.nextInt();

            if (numero <= 0) {
               System.out.println("Debe ingresar un número entero positivo. Intente nuevamente.");
               miScanner.nextLine();
               continue;
            }
            suma += numero;
            boolean respuestaValida = false;
            while (!respuestaValida) {
               System.out.println("¿Desea ingresar otro número? (s/n):");
               String respuesta = miScanner.next();

               if (respuesta.equalsIgnoreCase("s")) {
                  continuar = true;
                  respuestaValida = true;
               } else if (respuesta.equalsIgnoreCase("n")) {
                  continuar = false;
                  respuestaValida = true;
               } else {
                  System.out.println("Respuesta inválida. Por favor ingrese 's' para sí o 'n' para no.");
               }
            }

         } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número entero positivo. Intente nuevamente.");
            miScanner.nextLine();
         } catch (Exception e) {
            System.out.println("Ha ocurrido un error. Intente nuevamente.");
            miScanner.nextLine();
         }
      } while (continuar);

      System.out.println("La suma acumulada de los números ingresados es: " + suma);

      miScanner.close();
   }
}
