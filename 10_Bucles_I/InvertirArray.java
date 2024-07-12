public class InvertirArray {
   public static void main(String[] args) {
      int[] array = { 23, 45, 23, 7, 1, 324, 435 };
      int n = array.length;

      for (int i = 0; i < n / 2; i++) {
         int temp = array[i];
         array[i] = array[n - 1 - i];
         array[n - 1 - i] = temp;
      }
      for (int num : array) {
         System.out.print(num + " ");
      }
   }
}
