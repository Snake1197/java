import java.util.Scanner;
public class NumeroParImpar {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      System.out.println("Ingrese un número");
      float numero = miScanner.nextInt();
      System.out.println(numero%2 == 0 ? "El número es par" : "El número es impar");
      miScanner.close();
   }
}
