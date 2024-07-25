import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManipulandoOraciones {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      String oracion = "";
      boolean sesion = true;

      System.out.println("Bienvenido!\n\n");
      while (sesion) {
         try {
            String mensaje = oracion.isEmpty() ? "Crear oración" : "Borrar la oración";
            System.out.println(
                  "\nElija una de las siguientes opciones:\n1. " + mensaje
                        + "\n2. Cantidad de caracteres de la oración\n3. Cantidad de palabras de la oración\n4. Mostrar palabras ordenadas alfabéticamente\n5. Ingresar un número y devolver la palabra correspondiente\n6. Buscar palabra dentro de la oración\n7. Modificar palabra dentro de la oración\n8. Agregar contenido a la oración\n\n9. Salir");
            int opcion = miScanner.nextInt();
            miScanner.nextLine();
            if (oracion.isEmpty() && opcion != 1) {
               opcion = 0;
            }
            switch (opcion) {
               case 0:
                  System.out.println("Debe crear una oración para utilizar las demás opciones.");
                  break;
               case 1:
                  if (oracion.isEmpty()) {
                     System.out.println("Ingrese una oración:");
                     String nuevaOracion = miScanner.nextLine();
                     oracion = nuevaOracion;
                     System.out.println("Se ha registrado la oración: " + oracion);
                  } else {
                     oracion = "";
                     System.out.println("La oración ha sido borrada");
                  }
                  break;
               case 2:
                  System.out.println("La cantidad de caracteres de la oración es: " + oracion.length());
                  break;
               case 3:
                  String[] palabras = oracion.split("\\s+");
                  System.out.println("La cantidad de palabras de la oración es: " + palabras.length);
                  break;
               case 4:
                  String[] ordenado = oracion.split("\\s+");
                  Arrays.sort(ordenado);
                  System.out.println("La oración ordenada alfabéticamente es: " + Arrays.toString(ordenado));
                  break;
               case 5:
                  String[] oracionArray = oracion.split("\\s+");
                  boolean fueraRango = true;
                  do {
                     try {
                        System.out.println("Ingrese un número:");
                        int posicion = miScanner.nextInt();
                        if (posicion < 0 || posicion > oracionArray.length) {
                           System.out.println("El número ingresado está fuera de rango. Intenta nuevamente");
                        } else {
                           System.out
                                 .println(
                                       "La palabra en la posición " + posicion + " es: " + oracionArray[posicion - 1]);
                           fueraRango = false;
                        }
                     } catch (InputMismatchException e) {
                        System.out.println("Solo debe ingresar valores enteros");
                        miScanner.nextLine();
                     }
                  } while (fueraRango);
                  break;
               case 6:
                  String[] arrayPalabras = oracion.split("\\s+");
                  String palabraABuscar = miScanner.nextLine();
                  int count = 0;
                  for (String palabra : arrayPalabras) {
                     if (palabra.equals(palabraABuscar)) {
                        count += 1;
                     }
                  }
                  break;
               case 9:
                  System.out.println("Gracias\n\n");
                  sesion = false;
                  break;
               default:
                  System.out.println("La opción ingresada es incorrecta");
                  break;
            }
         } catch (InputMismatchException e) {
            System.out.println("Solo debe ingresar números enteros");
            miScanner.nextLine();
         }
      }
   }
}
