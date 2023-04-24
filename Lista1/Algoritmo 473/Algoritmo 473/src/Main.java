import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String c;
        int x;

        System.out.print("\nDigite letra: ");
        c = sc.nextLine();

        x = Algoritmo473.maiuscula(c);

        if (x == 1) {
            System.out.println("\nÉ uma consoante.");
        } else {
            System.out.println("\nNão é uma consoante.");
        }
    }
}
