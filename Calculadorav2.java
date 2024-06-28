import java.util.Scanner;

public class Calculadorav2 {
    
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Calculadora\n\nIngrese un número:");
        float primerNumero = miScanner.nextFloat();
        
        System.out.println("Ingrese otro número:");
        float segundoNumero = miScanner.nextFloat();
        
        System.out.println("Elija la operación que desee realizar: \n 1 - Sumar \n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir");
        int opcion = miScanner.nextInt();
        
        float resultado = 0;
        boolean operacionValida = true;
        
        switch (opcion) {
            case 1:
                resultado = sumar(primerNumero, segundoNumero);
                break;
            case 2:
                resultado = restar(primerNumero, segundoNumero);
                break;
            case 3:
                resultado = multiplicar(primerNumero, segundoNumero);
                break;
            case 4:
                if (segundoNumero != 0) {
                    resultado = dividir(primerNumero, segundoNumero);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                operacionValida = false;
                break;
        }
        
        if (operacionValida) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
        
        miScanner.close();
    }
    
    public static float sumar(float a, float b) {
        return a + b;
    }
    
    public static float restar(float a, float b) {
        return a - b;
    }
    
    public static float multiplicar(float a, float b) {
        return a * b;
    }
    
    public static float dividir(float a, float b) {
        return a / b;
    }
}
