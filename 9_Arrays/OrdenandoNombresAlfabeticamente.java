import java.util.Scanner;

public class OrdenandoNombresAlfabeticamente {

   public static void main(String[] args) {
      String[] nombres = new String[4];

      Scanner scanner = new Scanner(System.in);
      System.out.println("Ingrese 4 nombres:");
      nombres[0] = scanner.nextLine();
      nombres[1] = scanner.nextLine();
      nombres[2] = scanner.nextLine();
      nombres[3] = scanner.nextLine();

      if (nombres[0].compareTo(nombres[1]) > 0) {
         String temp = nombres[0];
         nombres[0] = nombres[1];
         nombres[1] = temp;
      }
      if (nombres[1].compareTo(nombres[2]) > 0) {
         String temp = nombres[1];
         nombres[1] = nombres[2];
         nombres[2] = temp;
      }
      if (nombres[0].compareTo(nombres[1]) > 0) {
         String temp = nombres[0];
         nombres[0] = nombres[1];
         nombres[1] = temp;
      }
      if (nombres[2].compareTo(nombres[3]) > 0) {
         String temp = nombres[2];
         nombres[2] = nombres[3];
         nombres[3] = temp;
      }
      if (nombres[1].compareTo(nombres[2]) > 0) {
         String temp = nombres[1];
         nombres[1] = nombres[2];
         nombres[2] = temp;
      }
      if (nombres[0].compareTo(nombres[1]) > 0) {
         String temp = nombres[0];
         nombres[0] = nombres[1];
         nombres[1] = temp;
      }

      System.out.println("Nombres ordenados alfabéticamente:");
      System.out.println(nombres[0]);
      System.out.println(nombres[1]);
      System.out.println(nombres[2]);
      System.out.println(nombres[3]);

      scanner.close();
   }

}
