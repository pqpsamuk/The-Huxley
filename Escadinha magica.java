import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String n = "";
        int acumulador = entrada.nextInt();
        for (int i = 1; i <= acumulador; i++) {
            n = n + "" + i + " ";
            System.out.println(n.trim());

        }
    }

}
