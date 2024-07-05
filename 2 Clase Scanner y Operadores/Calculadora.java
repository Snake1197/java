import java.util.Scanner;

public class Calculadora {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Calculadora\n\nIngrese un número");
      float primerNumero = miScanner.nextFloat();

      System.out.println("Ingrese otro número");
      float segundoNumero = miScanner.nextFloat();

      System.out.println(
            "Elija la operación que desee realizar \n 1 - Sumar \n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir");
      int opcion = miScanner.nextInt();
      float resultado = opcion == 1 ? primerNumero + segundoNumero
            : opcion == 2 ? primerNumero - segundoNumero
                  : opcion == 3 ? primerNumero * segundoNumero : primerNumero / segundoNumero;
      System.out.println("El resultado de la operación es: " + resultado);
      miScanner.close();
   }

}
