import java.util.Scanner;

public class CalculadoraAreaYPerimetrov3 {
   public static void main(String[] args) {
      int option;
      int subOption;
      Scanner geometric = new Scanner(System.in);
      System.out.println("Por favor seleccionar la figura geométrica:");
      System.out.println("1. Círculo");
      System.out.println("2. Rectángulo");
      System.out.print("Selección: ");
      option = geometric.nextInt();
      System.out.println("Por favor indicar el valor a calcular: ");
      System.out.println("1. Area");
      System.out.println("2. Perímetro");
      System.out.print("Selección: ");
      subOption = geometric.nextInt();

      switch (option) {
         case 1:
            System.out.println("Ingrese el radio del círculo");
            double ratio = geometric.nextDouble();
            if (subOption == 1) {
               double area = ratio * ratio * Math.PI;
               System.out.println("El area del círculo es: " + String.format("%.2f", area));
            } else if (subOption == 2) {
               double perimetro = 2 * ratio * Math.PI;
               System.out.println("El perímetro del círculo es: " + String.format("%.2f", perimetro));
            } else {
               System.out.println("La opción seleccionada es incorrecta");
            }
            break;
         case 2:
            System.out.println("Ingrese la base del rectángulo");
            double base = geometric.nextDouble();
            System.out.println("Ingrese la altura del rectángulo");
            double altura = geometric.nextDouble();
            if (subOption == 1) {
               double area = base * altura;
               System.out.println("El area del rectángulo es: " + String.format("%.3f", area));
            } else if (subOption == 2) {
               double perimetro = 2 * base * altura;
               System.out.println("El perímetro del rectángulo es: " + String.format("%.3f", perimetro));
            } else {
               System.out.println("La opción seleccionada es incorrecta");
            }
            break;
         default:
            System.out.println("La figura seleccionada es incorrecta");
            break;
      }
      geometric.close();
   }
}