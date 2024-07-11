public class GenerandoNumeroAleatorio {
   public static void main(String[] args) {
      int[] array = { 21, 45, 24, 51, 20, 54 };
      int numPares = 0;
      numPares += array[0] % 2 == 0 ? 1 : 0;
      numPares += array[1] % 2 == 0 ? 1 : 0;
      numPares += array[2] % 2 == 0 ? 1 : 0;
      numPares += array[3] % 2 == 0 ? 1 : 0;
      numPares += array[4] % 2 == 0 ? 1 : 0;
      numPares += array[5] % 2 == 0 ? 1 : 0;
      if (numPares != 0) {
         System.out.println("El array contiene " + numPares + " números pares.");
      } else {
         System.out.println("El array no contiene números enteros.");
      }

   }
}
