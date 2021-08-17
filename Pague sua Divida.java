import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner leia = new Scanner(System.in);
		
		int Divida = leia.nextInt();
		int Valor  = leia.nextInt();
		
		for (int i = Divida; i > 0; i = Divida) {
			System.out.println("(antes) " + Divida);
			Divida = (Valor > Divida) ? 0 : Divida - Valor;
			System.out.println("(depois) " + Divida);
			
		}
  }
}
