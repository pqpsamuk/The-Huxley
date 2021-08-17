import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner read = new Scanner(System.in);

		String Comida = read.next().toLowerCase();
		String Bebida = read.next().toLowerCase();
		double valor = 0;
		
		switch (Comida) {
		case "lasanha":
			valor +=8;
			break;
		case "estrogonofe":
			valor+=11;
			break;

		default:
			break;
		}

		if (Bebida.equals("suco")) {
			valor+=2.5;
		}
		if (Bebida.equals("refrigerante")) {
			valor+=3;
		}
	
		System.out.println(new DecimalFormat("#0.00").format( valor ));
  }
}
