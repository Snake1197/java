public class EncontrandoValorMinimo {
   public static void main(String[] args) {
      int[] array = { 23, 45, 23, 1, 324, 435 };
      int numMenor = array[0];
      for (int i = 0; i < array.length; i++) {
         if (array[i] < numMenor) {
            numMenor = array[i];
         }
      }
      System.out.println("El número menor es: " + numMenor);
   }
}
