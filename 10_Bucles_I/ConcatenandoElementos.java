public class ConcatenandoElementos {
   public static void main(String[] args) {
      String[] array = { "Concatenando", "elementos", "de", "tipo", "cadena" };
      String resultado = "";

      for (String elemento : array) {
         resultado += elemento + " ";
      }
      resultado = resultado.trim();
      System.out.println("Resultado: " + resultado);
   }
}
