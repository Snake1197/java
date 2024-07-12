public class CalculandoPromedio {
   public static void main(String[] args) {
      float[] array = new float[20];

      for (int i = 0; i < array.length; i++) {
         array[i] = (float) (Math.random() * 100);
      }
      float suma = 0;
      for (float f : array) {
         suma += f;
      }
      float promedio = suma / array.length;
      System.out.println("La suma de los números es: " + suma);
      System.out.println("El promedio de los números es: " + promedio);
   }
}
