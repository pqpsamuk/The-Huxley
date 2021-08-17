import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner leia = new Scanner(System.in);
		
		int QtdeNumeros = leia.nextInt();
		int Valor  = leia.nextInt();
		int Num,Frequencia = 0;
		
		
		for(int i=0; i<QtdeNumeros; i++) {
			
			Num = leia.nextInt();
			Frequencia += (Num == Valor) ? 1 : 0;
			
		}
		
		System.out.println(Frequencia);
  }
}
