import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L, c, t, tl;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];

        for (L = 0; L < 3; L++) {
            System.out.println("\nDigite nome:");
            nome[L] = sc.nextLine();
            System.out.println("Digite endereco:");
            ender[L] = sc.nextLine();
            System.out.println("Digite profissao:");
            prof[L] = sc.nextLine();
        }

        for (L = 0; L < 2; L++) {
            for (c = L + 1; c < 3; c++) {
                if (nome[L].compareTo(nome[c]) > 0) {
                    Algoritmo494.troca(nome, L, c);
                    Algoritmo494.troca(ender, L, c);
                    Algoritmo494.troca(prof, L, c);
                }
            }
        }

        for (L = 0; L < 3; L++) {
            System.out.println("\n" + nome[L] + "\t" + ender[L] + "\t" + prof[L]);
        }
    }
}