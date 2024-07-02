import java.util.Scanner;

public class DeterminacionEdades {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      System.out.println("Ingrese su edad");
      int edad = miScanner.nextInt();
      if (edad >= 65) {
         System.out.println("Eres un adulto mayor");
      } else if (edad < 65 && edad>= 18){
         System.out.println("Eres adulto");
      } else if (edad >0 && edad < 18){
         System.out.println("Eres menor de edad");
      } else {
         System.out.println("Valor no válido");
      }
      miScanner.close();
   }
}
