import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscandoElemento {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      int[] array = { 1, 2, 3 };
      try {
         System.out.println("Ingrese el número que desea buscar:");
         int numeroBuscado = miScanner.nextInt();
         String respuesta = array[0] == numeroBuscado ? "sí"
               : array[1] == numeroBuscado ? "sí" : array[2] == numeroBuscado ? "sí" : "no";
         System.out.println("El número buscado " + respuesta + " se encuentra en el array.");
      } catch (InputMismatchException e) {
         System.out.println("Solo debe ingresar números enteros");
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió.");
      }
      miScanner.close();
   }
}
