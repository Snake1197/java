public class ContantoElementosPares {
   public static void main(String[] args) {
      int[] array = new int[10];

      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (Math.random() * 100);
      }
      System.out.print("Elementos del array: ");
      for (int num : array) {
         System.out.print(num + " ");
      }
      System.out.println();

      int countPares = 0;
      for (int num : array) {
         if (num % 2 == 0) {
            countPares++;
         }
      }
      System.out.println("Total de elementos pares: " + countPares);
   }
}
