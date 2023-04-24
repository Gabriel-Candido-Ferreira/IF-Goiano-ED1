import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in );
        System.out.println("Digite o numero 1:");
        num1 = sc.nextInt();
        System.out.println("Digite o numero 2:");
        num2 = sc.nextInt();

        Algoritimo465.verificaMaiorNumero(num1, num2);
    }
}