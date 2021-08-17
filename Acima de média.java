import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner read = new Scanner(System.in);
		double Numero3, Numero2, Numero1;
		int Quantidade = 0;
		double Media = ((Numero3 = read.nextDouble()) + (Numero2 = read.nextDouble()) + (Numero1 = read.nextDouble()))
				/ 3;
		Quantidade += (Numero3 > Media) ? 1 : 0;
		Quantidade += (Numero2 > Media) ? 1 : 0;
		Quantidade += (Numero1 > Media) ? 1 : 0;
		System.out.println(Quantidade);
  }
}