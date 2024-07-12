public class SumaAcumulada {
   public static void main(String[] args) {
      int[] array = { 23, 45, 23, 7, 1, 324, 435 };
      int sumaAcumulada = 0;
      for (int i = 0; i < array.length; i++) {
         sumaAcumulada += array[i];
         array[i] = sumaAcumulada;
      }

      for (int num : array) {
         System.out.print(num + " ");
      }
   }
}
