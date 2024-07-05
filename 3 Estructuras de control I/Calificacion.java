import java.util.Scanner;

public class Calificacion {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingrese la calificación obtenida");
      double nota = miScanner.nextDouble();

      if (nota < 0 || nota > 100) {
         System.out.println("El valor ingresado está fuera del intervalo (0 - 100)");
      } else if (nota < 60) {
         System.out.println("La nota obtenida es: F");
      } else if (nota <= 69) {
         System.out.println("La nota obtenida es: D");
      } else if (nota <= 79) {
         System.out.println("La nota obtenida es: C");
      } else if (nota <= 89) {
         System.out.println("La nota obtenida es: B");
      } else {
         System.out.println("La nota obtenida es: A");
      }
      miScanner.close();
   }
}
