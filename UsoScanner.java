import java.util.Scanner;
public class UsoScanner {
   public static void main(String[] args) {
       Scanner miScanner = new Scanner(System.in);

      System.out.println("Ingresa su nombre: ");
      String nombre = miScanner.nextLine();
      
      System.out.println("Ingresa su edad: ");
      int edad = miScanner.nextInt();
      miScanner.close();


      System.out.println("Su nombre es "+nombre+" y su edad es " + edad);

   }
 
}
