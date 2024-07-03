import java.util.Scanner;

public class SeleccionOpcion {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingrese un valor (1 al 3) según las siguientes opciones:\n 1-Guardar\n 2-Cargar\n 3-Salir");

      String opcion = miScanner.nextLine();
      // El trim() es para quitar espacios derecha e izquierda
      switch (opcion.trim()) {
         case "1" -> System.out.println("Los cambios han sido guardados.");
         case "2" -> System.out.println("El archivo ha sido cargado correctamente.");
         case "3" -> System.out.println("Gracias por usar el aplicativo, vuelva pronto.");
         default -> System.out.println("El valor ingresado no es válido");
      }
      miScanner.close();
   }
}
