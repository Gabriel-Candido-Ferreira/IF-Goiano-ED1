import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite numero : " + (i+1) + ": ");
            num[i] = sc.nextInt();
        }
        int c = VerificaOrdem.verificaOrdem(num, 10);
        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        } else {
            System.out.println("\nNAO ESTA ORDENADO");
        }    }
}