import java.util.Scanner;

public class AreaGeometrica {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);

      System.out
            .println("Ingrese un valor (1 al 3) según las siguientes opciones:\n 1-Círculo\n 2-Cuadrado\n 3-Triángulo");

      String figura = miScanner.nextLine();
      double area = 0;
      // El trim() es para quitar espacios derecha e izquierda
      switch (figura.trim()) {
         case "1" -> {
            System.out.println("Ingrese el radio del círculo:");
            double radio = miScanner.nextDouble();
            area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es: " + area);
         }
         case "2" -> {
            System.out.println("Ingrese el lado del cuadrado:");
            double lado = miScanner.nextDouble();
            area = lado * lado;
            System.out.println("El área del cuadrado es: " + area);
         }
         case "3" -> {
            System.out.println("Ingrese la base del triángulo:");
            double base = miScanner.nextDouble();
            System.out.println("Ingrese la altura del triángulo:");
            double altura = miScanner.nextDouble();
            area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
         }
         default -> System.out.println("El valor ingresado no es válido");
      }
      miScanner.close();
   }
}
