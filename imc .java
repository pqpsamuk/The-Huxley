import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
		
		double peso;
		double altura; 
		int imc;
		
		
		peso = s.nextDouble();
		altura = s.nextDouble();
		
		imc = (int) ((peso) / (altura * altura));
		
		System.out.println("Digite a massa em kg e altura em m:\r\n" + 
				"IMC: " + imc);
	}

}