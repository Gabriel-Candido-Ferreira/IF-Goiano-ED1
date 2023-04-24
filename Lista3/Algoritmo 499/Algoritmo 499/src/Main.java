import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[5];
        int flag = 0, op;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n\n\n MENU VETOR - FUNÇÃO ");
            System.out.println("\n1 Dados do VETOR");
            System.out.println("\n2 Ordena VETOR");
            System.out.println("\n3 Imprime VETOR");
            System.out.println("\n4 Sai do programa");
            System.out.print("\nOPÇÃO: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    Algoritmo499.entrada(num, 5);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        ordena.ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opção 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        imprime.imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opção 1");
                    }
                    break;
                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (op != 4);

        input.close();

    }
}