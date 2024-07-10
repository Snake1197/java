import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionTemperatura {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese la temperatura:");
         double temperatura = miScanner.nextDouble();
         System.out.println("Ingrese la unidad de medida (C/F):");
         String medida = miScanner.nextLine().toUpperCase();
         if (medida != "C" && medida != "F") {
            System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
         } else {
            double temperaturaConvertida = medida == "C" ? ((temperatura * 9.0) / 5.0) + 32.0
                  : (temperatura - 32.0) * 5.0 / 9.0;
            String resultado = medida == "C"
                  ? temperatura + " grados Celsius equivale a " + temperaturaConvertida + " grados Fahrenheit."
                  : temperatura + " grados Fahrenheit equivale a " + temperaturaConvertida + " grados Celsius.";
            System.out.println(resultado);
         }
      } catch (InputMismatchException e) {
         System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió en la conversión.");
      }
      miScanner.close();
   }
}
