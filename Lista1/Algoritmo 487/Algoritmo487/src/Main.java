import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o número %d: ", i + 1);
            num[i] = sc.nextInt();
        }
        Algoritmo487.inverte(num, n);
        System.out.println("\nVETOR");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%d - %d", i + 1, num[i]);
        }
        System.out.println();
    }
}
