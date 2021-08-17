import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
   Scanner read = new Scanner(System.in);
String palavraUsuario = "";
int verificador = 0;
do {
palavraUsuario = read.next();
int charInt = 0, resultado = 0;
verificador = Integer.parseInt(palavraUsuario);
for (int i = 0; i < palavraUsuario.length() && verificador > -1; i++) {
charInt = Character.getNumericValue(palavraUsuario.charAt(i));

resultado += ((charInt % 2) == 0) ?  0 : charInt;

}
if (verificador != -1)
System.out.println(resultado);


} while (verificador > -1);
  }
}