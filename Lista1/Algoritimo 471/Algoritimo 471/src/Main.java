import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numl, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dividendo:");
        num = sc.nextInt();
        System.out.println("Digite o divisor:");
        numl = sc.nextInt();
        while (numl > num) {
            System.out.println("Inválido. Digite um número menor do que o dividendo:");
            numl = sc.nextInt();
        }
        /* chama a função divisor */
        n = Algoritmo471.divisor(num, numl);
        if (n == 0) {
            System.out.println("Nenhuma vez");
        } else {
            System.out.println("Numero de vezes: " + n);
        }
    }
}
