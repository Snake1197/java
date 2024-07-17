import java.util.Arrays;

public class OrdenarFormaDescendente {
   public static void main(String[] args) {
      int[] array = new int[10];

      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 100);
      }
      Arrays.sort(array);
      int n = array.length;

      for (int i = 0; i < n / 2; i++) {
         int temp = array[i];
         array[i] = array[n - 1 - i];
         array[n - 1 - i] = temp;
      }

      System.out.println(Arrays.toString(array));
   }
}
