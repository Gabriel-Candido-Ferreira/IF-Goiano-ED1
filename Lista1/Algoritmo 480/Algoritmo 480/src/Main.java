import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        x = Algoritmo480.reverso(n);
        System.out.println(n + " - " + x);
        if (x == n) {
            System.out.println("É um número capicua.");
        } else {
            System.out.println("Não é um número capicua.");
        }
    }
}