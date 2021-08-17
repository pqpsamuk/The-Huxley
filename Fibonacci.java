import java.util.Scanner;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        for (int j = 0;; j++) {
            int valor;
            int resultado = 0;
            int c = 1;
            System.out.println();
            valor = entrada.nextInt();
            for (int i = 1; i <= valor; ++i) {
                System.out.print(resultado);
                int d = resultado + c;
                resultado = c;
                c = d;
                if (i <= valor-1){
                    System.out.print (" ");
                }
            }
            if (valor == 0) {
                break;
            }

        }
    }
}

