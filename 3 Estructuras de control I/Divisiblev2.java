import java.util.Scanner;

public class Divisiblev2 {
   public static void main(String[] args) {
      Scanner variable = new Scanner(System.in);
      System.out.print("Por favor ingrese un número: ");
      double numero = variable.nextDouble();
      if (numero % 5 == 0) {
         if (numero % 3 == 0) {
            System.err.println("Ambos");
         } else {
            System.err.println("Solo 5");
         }
      } else if (numero % 3 == 0) {
         System.err.println("Solo 3");
      } else {
         System.err.println("Ninguno");
      }
      variable.close();
   }
}