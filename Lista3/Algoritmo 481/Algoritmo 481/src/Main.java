import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, base, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número maior ou igual a 0: ");
        num = sc.nextInt();
        while (num < 0) {
            System.out.print("Número negativo. Digite um número maior ou igual a 0: ");
            num = sc.nextInt();
        }

        System.out.print("Digite a base em que deseja representá-lo (2-10): ");
        base = sc.nextInt();
        while (base < 2 || base > 10) {
            System.out.print("Não sei converter. Digite a base em que deseja representá-lo (2-10): ");
            base = sc.nextInt();
        }

        c = Algoritmo481.converte(num, base);

        System.out.println("Número em decimal: " + num);
        System.out.println("Número na base " + base + ": " + c);
    }
}
