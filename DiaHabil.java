import java.util.Scanner;

public class DiaHabil {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingrese un valor (1 al 7) para indicar el día de la semana correspondiente");

      String dia = miScanner.nextLine();
      // El trim() es para quitar espacios derecha e izquierda
      String tipoDia = switch (dia.trim()) {
         case "1", "2", "3", "4", "5" -> "hábil";
         case "6", "7" -> "no hábil";
         default -> "valor no válido";
      };

      String diaNombre = switch (dia.trim()) {
         case "1" -> "Lunes";
         case "2" -> "Martes";
         case "3" -> "Miércoles";
         case "4" -> "Jueves";
         case "5" -> "Viernes";
         case "6" -> "Sábado";
         case "7" -> "Domingo";
         default -> "valor no válido";
      };

      if (tipoDia == "valor no válido" || dia == "valor no válido") {
         System.out.println("El valor ingresado no es válido.");
      } else {
         System.out.println("El valor ingresado corresponde al día " + diaNombre + " y es un día " + tipoDia);
      }

      miScanner.close();
   }
}
