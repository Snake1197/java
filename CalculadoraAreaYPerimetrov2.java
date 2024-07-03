import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraAreaYPerimetrov2 {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         System.out.println(
               "Seleccione una opción: \nOpción 1: Círculo \nOpción 2: Rectángulo ");

         try {
            int opcion = scanner.nextInt();

            switch (opcion) {
               case 1 -> {
                  System.out.println("Ingresa el radio del círculo: ");
                  double radio = scanner.nextDouble();
                  System.out
                        .println("Desea conocer el área o el perímetro?\nOpción 1: perímetro \nOpción 2: Área");
                  try {
                     int value = scanner.nextInt();
                     String resultado = switch (value) {
                        case 1 -> {
                           double perimetro = 2 * Math.PI * radio;
                           yield "El perímetro del círculo es: " + perimetro;
                        }
                        case 2 -> {
                           double area = Math.PI * Math.pow(radio, 2);
                           yield "El área del círculo es: " + area;
                        }
                        default -> "Opción no válida";
                     };
                     System.out.println(resultado);
                  } catch (InputMismatchException e) {
                     System.out.println("Opción no válida");
                  }
               }
               case 2 -> {
                  System.out.println("Ingresa el lado del rectángulo:");
                  double lado = scanner.nextDouble();
                  System.out.println("Ingresa la altura del rectángulo:");
                  double altura = scanner.nextDouble();
                  System.out
                        .println("Desea conocer el área o el perímetro?\nOpción 1: perímetro \nOpción 2: Área");
                  try {
                     int value = scanner.nextInt();
                     String resultado = switch (value) {
                        case 1 -> {
                           double perimetroRectangulo = (2 * altura) + (2 * lado);
                           yield "El perímetro del rectángulo es: " + perimetroRectangulo;
                        }
                        case 2 -> {
                           double areaRectangulo = altura * lado;
                           yield "El área del rectángulo es: " + areaRectangulo;
                        }
                        default -> "Opción no válida";
                     };
                     System.out.println(resultado);
                  } catch (InputMismatchException e) {
                     System.out.println("Opción no válida");
                  }
               }
               default -> System.out.println("Opción no válida");
            }
         } catch (InputMismatchException e) {
            System.out.println("Opción no válida");
         }
      }
   }
}