import java.util.Scanner;

public class BusquedaCaracteres {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese una cadena de texto:");
         String cadena = miScanner.nextLine();
         System.out.println("Ingrese el caracter a buscar:");
         String caracter = miScanner.nextLine();
         int posicion = cadena.indexOf(caracter);
         if (posicion < 0) {
            System.out.println("El caracter no ha sido encontrado :(");
         } else {
            System.out.println("El caracter se encuentra en la posicion: " + posicion);
         }
      } catch (Exception e) {
         System.out.println("Algo ocurrió, por favor comunicarse con soporte.");
      }
      miScanner.close();
   }
}
