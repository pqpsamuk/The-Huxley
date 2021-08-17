import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HuxleyCode {
    public static void main(String args[]) {
        System.out.println("Digite um numero de um canal de tv:");
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt(); 
        int canaisDeTv = valor;
        switch (canaisDeTv) {
            case 6:
                System.out.println("REDETV!");
                break;
            case 13:
                System.out.println("GLOBO");
                break;
            case 16:
                System.out.println("Canal Invalido");
                break;
            case 9:
                System.out.println("RECORD");
                break;
            case 2:
                System.out.println("SBT");
                break;
            case 4:
                System.out.println("BAND");
                break;
            default:
                System.out.println("Canal Invalido");
        }
    }
}
