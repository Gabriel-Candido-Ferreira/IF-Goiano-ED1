import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int n, c;
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "o numero: ");
            num[i] = sc.nextInt();
        }
        System.out.print("Digite o numero de busca: ");
        n = sc.nextInt();
        Algoritmo497.ordena(num, 10);
        c = Busca.busca(num, 10, n);
        System.out.println("\nVETOR ORDENADO:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + " - " + num[i]);
        }
        if (c >= 0) {
            System.out.println("\nPosicao no vetor: " + (c+1));
        } else {
            System.out.println("\nNao encontrado");
        }
    }
}
