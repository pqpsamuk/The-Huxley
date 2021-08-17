import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HuxleyCode {
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de cavalos");
        Scanner entrada = new Scanner(System.in);
        String s = entrada.nextLine().replace("cavalos = ", "");
        int cavalos = Integer.parseInt(s);
        int soma = (cavalos * 4);
        System.out.println("Sao necessarias " + soma + " ferraduras");

    }
}
