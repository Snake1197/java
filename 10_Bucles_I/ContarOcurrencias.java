import java.util.Scanner;

public class ContarOcurrencias {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      String frase = "Nuca pares de aprender";
      char[] fraseArray = frase.toCharArray();
      int contador = 0;
      try {
         System.out.println("La frase es: " + frase);
         System.out.println("Ingresa el carácter que deseas buscar: ");
         String input = miScanner.nextLine();
         if (input.length() > 1 || input.length() < 0) {
            System.out.println("Debe ingresar solo o al menos un caracter.");
         } else {
            char caracter = input.charAt(0);
            for (char c : fraseArray) {
               if (c == caracter) {
                  contador++;
               }
            }
         }
         System.out.println("El carácter ingresado aparece " + contador + " veces en la frase.");
      } catch (Exception e) {
         System.out.println("Ups, algo ocurrió!");
      }
      miScanner.close();
   }
}
