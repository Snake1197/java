import java.util.Scanner;

public class DiaDeLaSemana {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingrese un valor (1 al 7) para indicar el día de la semana correspondiente");

      String dia = miScanner.nextLine();
      // El trim() es para quitar espacios derecha e izquierda
      switch (dia.trim()) {
         case "1" -> System.out.println("El día es: Lunes");
         case "2" -> System.out.println("El día es: Martes");
         case "3" -> System.out.println("El día es: Miércoles");
         case "4" -> System.out.println("El día es: Jueves");
         case "5" -> System.out.println("El día es: Viernes");
         case "6" -> System.out.println("El día es: Sábado");
         case "7" -> System.out.println("El día es: Domingo");
         default -> System.out.println("El valor ingresado no es válido");
      }
      miScanner.close();
   }
}
