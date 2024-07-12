public class ImprimiendoElementosOrdenInverso {
   public static void main(String[] args) {
      int[] array = { 23, 45, 23, 1, 324, 435 };

      for (int i = array.length - 1; i >= 0; i--) {
         System.out.println(array[i]);
      }
   }
}
