import java.util.Scanner;

public class If {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      System.out.println("Ingrese un número");
      double numero = miScanner.nextDouble();

      if (numero > 0) {
         System.out.println("El número es positivo");
      } else if (numero < 0){
         System.out.println("El número es negativo");
      } else if (numero == 0) {
         System.out.println("El número es cero");
      } else {
         System.out.println("No es un número");
      }

      miScanner.close();
   }
}
