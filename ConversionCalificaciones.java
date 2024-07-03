import java.util.Scanner;

public class ConversionCalificaciones {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingrese un valor (1 al 5) para indicar el equivalente de la calificación");

      String dia = miScanner.nextLine();
      // El trim() es para quitar espacios derecha e izquierda
      switch (dia.trim()) {
         case "1" -> System.out.println("Calificación: Muy deficiente");
         case "2" -> System.out.println("Calificación: Deficiente");
         case "3" -> System.out.println("Calificación: Suficiente");
         case "4" -> System.out.println("Calificación: Notable");
         case "5" -> System.out.println("Calificación: Sobresaliente");
         default -> System.out.println("El valor ingresado no es válido");
      }
      miScanner.close();
   }
}
