import java.util.Scanner;

public class Calificacionv2 {
   public static void main(String[] args) {
      // Crear un objeto Scanner para leer la entrada del usuario
      Scanner scanner = new Scanner(System.in);

      // Solicitar al usuario que ingrese un número entre 0 y 100
      System.out.print("Por favor, ingrese un número entre 0 y 100: ");
      String entrada = scanner.nextLine();

      try {
         // Intentar convertir la entrada a un número
         int puntuacion = Integer.parseInt(entrada);

         // Validar si el número está en el rango de 0 a 100
         if (puntuacion < 0 || puntuacion > 100) {
            System.out.println("El número ingresado está fuera del rango válido.");
         } else {
            // Determinar la calificación correspondiente
            if (puntuacion >= 90) {
               System.out.println("Calificación: A");
            } else if (puntuacion >= 80) {
               System.out.println("Calificación: B");
            } else if (puntuacion >= 70) {
               System.out.println("Calificación: C");
            } else if (puntuacion >= 60) {
               System.out.println("Calificación: D");
            } else {
               System.out.println("Calificación: F");
            }
         }
      } catch (NumberFormatException e) {
         // Capturar la excepción si la entrada no es un número válido
         System.out.println("El valor ingresado no es un número válido.");
      } finally {
         // Cerrar el scanner
         scanner.close();
      }
   }
}