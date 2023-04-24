import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double z, L, b;
        int c;
        Scanner sc = new Scanner(System.in);
        for (c = 1; c < 3; c++) {

            System.out.println("Digite o logaritmando maior do que 0: ");
            L = sc.nextDouble();

            while (L < 0) {
                System.out.println("Inválido. Digite o logaritmando maior do que 0: ");
                L = sc.nextDouble();
            }
            System.out.println("Digite a base maior que 0 e diferente de 1:");
            b = sc.nextDouble();
            while (b <= 0 || b == 1) {
                System.out.println("Inválido. Digite a base maior que 0 e diferente de 1:");
                b = sc.nextDouble();
            }
            System.out.println("O logaritmo é " + Algoritimo467.loga(L, b));
            z = Algoritimo467.loga(L, b);
            System.out.println("z = " + z);
        }
    }
}