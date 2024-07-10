import java.util.Scanner;

public class ValidacionContrasenia {
   public static void main(String[] args) {
      Scanner miScanner = new Scanner(System.in);
      try {
         System.out.println("Ingrese su contraseña:");
         String contrasenia = miScanner.nextLine();
         boolean contieneMayuscula = false;
         boolean contieneMinuscula = false;
         boolean contieneNumero = false;
         boolean contieneCaracterEspecial = false;
         String mensaje = "";
         for (int i = 0; i < contrasenia.length(); i++) {
            char c = contrasenia.charAt(i);
            if (Character.isUpperCase(c)) {
               contieneMayuscula = true;
            }
            if (Character.isLowerCase(c)) {
               contieneMinuscula = true;
            }
            if (Character.isDigit(c)) {
               contieneNumero = true;
            }
            if ("!@#$%^&*()-+".indexOf(c) >= 0) {
               contieneCaracterEspecial = true;
            }
         }

         if (contrasenia.trim().length() < 8) {
            mensaje += "Contraseña no segura. La contraseña debe tener al menos 8 caracteres.\n";
         }
         if (!contieneMayuscula || !contieneMinuscula) {
            mensaje += "Contraseña no segura. La contraseña debe contener al menos una letra mayúscula y una letra minúscula.\n";
         }
         if (!contieneNumero) {
            mensaje += "Contraseña no segura. La contraseña debe contener al menos un número.\n";
         }
         if (!contieneCaracterEspecial) {
            mensaje += "Contraseña no segura. La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).\n";
         }
         if (mensaje.length() == 0) {
            mensaje = "¡Contraseña segura! Cumple con todos los criterios.";
         }
         System.out.println(mensaje);
      } catch (Exception e) {
         System.out.println("Ups! Algo ocurrió");
      }
      miScanner.close();
   }
}
