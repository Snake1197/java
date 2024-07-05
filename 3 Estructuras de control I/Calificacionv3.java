import java.util.Scanner;

public class Calificacionv3 {
   public static void main(String[] args) {
      Scanner variable = new Scanner(System.in);
      System.out.print("Por favor ingrese un número: ");

      double numero = variable.nextDouble();

      if (numero >= 60 && numero <= 100) {
         if (numero <= 69) {
            System.err.println("D");
         }

         else if (numero <= 79) {
            System.err.println("C");
         }

         else if (numero <= 89) {
            System.err.println("B");
         }

         else {
            System.err.println("A");
         }
      } else if (numero < 60 && numero > 0) {
         System.err.println("F");
      } else {
         System.err.println("Fuera de rango");
      }

      variable.close();
   }
}