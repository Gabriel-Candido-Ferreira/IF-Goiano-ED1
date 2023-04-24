import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite nome " + (i + 1) + ": ");
            nome[i] = sc.nextLine();
        }

        Algoritmo495.ordena(nome);

        System.out.println("\n\nNOMES ORDENADOS\n");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - " + nome[i]);
        }
    }
}