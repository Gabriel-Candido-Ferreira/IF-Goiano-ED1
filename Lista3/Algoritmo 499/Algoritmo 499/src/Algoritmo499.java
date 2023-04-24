import java.util.Scanner;

public class Algoritmo499 {
    public  static void entrada(int[] vet, int tam) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntrada do VETOR");

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite numero " + (i+1) + ": ");
            vet[i] = sc.nextInt();
        }

        sc.close();
    }
}
