import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double ang, g;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite angulo em radianos: ");
        ang = sc.nextDouble();

        g = Algoritmo464.graus(ang);
        System.out.println("\nradianos: "+ ang + " graus " + g);
        System.out.println("\n");
    }
}
