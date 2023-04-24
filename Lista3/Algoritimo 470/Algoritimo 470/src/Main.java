import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, pri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número > 0:");
        num = sc.nextInt();
        pri = Algoritimo470.primo(num);

        if (pri == 0 ){
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }

    }
