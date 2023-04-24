import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Aviao> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=====================");
            System.out.println("Controle de decolagem");
            System.out.println("=====================");
            System.out.println("1 - Listar número de aviões aguardando na fila");
            System.out.println("2 - Autorizar decolagem do primeiro avião da fila");
            System.out.println("3 - Adicionar avião à fila de espera");
            System.out.println("4 - Listar todos os aviões na fila de espera");
            System.out.println("5 - Listar características do primeiro avião da fila");
            System.out.println("0 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Número de aviões na fila: " + fila.size());
            } else if (opcao == 2) {
                if (fila.isEmpty()) {
                    System.out.println("Não tem aviões na fila de espera");
                } else {
                    Aviao aviao = fila.remove();
                    System.out.println("Autorizando decolagem do avião " + aviao.getNome() + " - Número " + aviao.getNumero());
                }
            } else if (opcao == 3) {
                System.out.println("Digite o nome do avião:");
                String nome = sc.next();
                System.out.println("Digite o número do avião:");
                int numero = sc.nextInt();
                Aviao aviao = new Aviao(nome, numero);
                fila.add(aviao);
                System.out.println("Avião " + nome + " - Número " + numero + " adicionado à fila de espera");
            } else if (opcao == 4) {
                System.out.println("Aviões na fila de espera:");
                for (Aviao aviao : fila) {
                    System.out.println(aviao.getNome() + " - Número " + aviao.getNumero());
                }
            } else if (opcao == 5) {
                if (fila.isEmpty()) {
                    System.out.println("Não há aviões na fila de espera");
                } else {
                    Aviao aviao = fila.peek();
                    System.out.println("Próximo avião na fila:");
                    System.out.println(aviao.getNome() + " - Número " + aviao.getNumero());
                }
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}
