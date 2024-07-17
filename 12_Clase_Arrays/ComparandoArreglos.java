import java.util.Arrays;

public class ComparandoArreglos {
   public static void main(String[] args) {
      // Los arrays han sido construidos de tal forma que la probabilidad de que sean
      // iguales sea alta
      int[] array1 = new int[2];
      for (int i = 0; i < array1.length; i++) {
         array1[i] = (int) (Math.random() * 3 + 1);
      }
      int[] array2 = new int[2];
      for (int i = 0; i < array2.length; i++) {
         array2[i] = (int) (Math.random() * 3 + 1);
      }
      System.out.println(Arrays.toString(array1));
      System.out.println(Arrays.toString(array2));
      String respuesta = Arrays.equals(array1, array2) ? "iguales" : "diferentes";
      System.out.println("Los arrays son " + respuesta);
   }
}
