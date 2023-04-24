import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int L, c, aux;
        int[] num = new int[4];
        int[] num1 = new int[4];
        Scanner sc = new Scanner(System.in);

        for (L = 0; L < 4; L++) {
            System.out.printf("\n\nDigite 1 numero %d: ", L + 1);
            num[L] = sc.nextInt();
        }

        for (L = 0; L < 4; L++) {
            System.out.printf("\n\nDigite 2 numero %d: ", L + 1);
            num1[L] = sc.nextInt();
        }

        c = Algoritmo483.produtointerno(num, num1, 4);
        System.out.printf("\nVETOR A\tVETOR B\n");

        for (L = 0; L < 4; L++) {
            System.out.printf("%d\t%d\n", num[L], num1[L]);
        }

        System.out.printf("\n\nproduto interno: %d\n", c);
    }
}


