import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroAlumnos {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      String[] alumnos = new String[0];
      Double[] notas = new Double[0];
      boolean sesion = true;
      while (sesion) {
         try {
            System.out.println(
                  "\nElija una de las siguientes opciones:\n1. Registrar alumno\n2. Mostrar todos los alumnos\n3. Mostrar promedio de notas\n4. Buscar alumno por nombre\n5. Modificar nota por nombre\n6. Eliminar alumno por nombre\n\n9. Salir");
            int opcion = miScanner.nextInt();
            miScanner.nextLine();
            switch (opcion) {
               case 1:
                  boolean nombreVacio = true;
                  boolean notaValida = false;
                  String nombre;
                  Double nota = null;
                  do {
                     System.out.println("Ingrese el nombre del alumno:");
                     nombre = miScanner.nextLine();
                     if (nombre.isEmpty()) {
                        System.out.println("El nombre no puede estar vacío");
                     } else {
                        nombreVacio = false;
                     }
                  } while (nombreVacio);
                  do {
                     try {
                        System.out.println("Ingrese la nota (0 - 10):");
                        nota = miScanner.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                           notaValida = true;
                        } else {
                           System.out.println("La nota ingresada está fuera de los límites");
                        }
                     } catch (InputMismatchException e) {
                        System.out.println("Solo debe ingresar número decimales en los límites indicados.");
                        miScanner.nextLine();
                     }
                  } while (!notaValida);
                  String[] nuevosAlumnos = new String[alumnos.length + 1];
                  Double[] nuevasNotas = new Double[notas.length + 1];
                  System.arraycopy(alumnos, 0, nuevosAlumnos, 0, alumnos.length);
                  System.arraycopy(notas, 0, nuevasNotas, 0, notas.length);
                  nuevosAlumnos[alumnos.length] = nombre;
                  nuevasNotas[notas.length] = nota;

                  alumnos = nuevosAlumnos;
                  notas = nuevasNotas;
                  System.out.println("Alumnos: " + Arrays.toString(alumnos));
                  System.out.println("Notas: " + Arrays.toString(notas));
                  break;
               case 9:
                  System.out.println("Gracias por utilizar el servicio, vuelva pronto.");
                  sesion = false;
                  break;
               default:
                  System.out.println("El valor ingresado no es válido.");
                  break;
            }
         } catch (InputMismatchException e) {
            System.out.println("Solo debe ingresar valores enteros!");
            miScanner.nextLine();
         } catch (Exception e) {
            System.out.println("Ups! Algo ocurrió");
            miScanner.nextLine();
         }

      }
      miScanner.close();
   }
}
