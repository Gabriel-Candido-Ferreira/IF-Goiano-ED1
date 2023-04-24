import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        Questao346 exer = new Questao346();
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite a frase:");
        exer.frase = scann.nextLine();

        while (number != 4) {
            System.out.println("-----Menu-----");
            System.out.println("1- Imprime o comprimento da frase ");
            System.out.println("2 - Imprime os dois primeiros ,e os dois ultimos caracteres da frase");
            System.out.println("3 -  Imprime a frase espelhada ");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("");
            number = scann.nextInt();

            switch (number) {
                case 1:
                    System.out.println("o tamanho da frase é:" + exer.frase.length());
                    break;
                case 2:
                    System.out.println("Os dois primeiros caracteris são:" + exer.frase.charAt(0) + exer.frase.charAt(1));
                    String fraseInvertida = new StringBuilder(exer.frase).reverse().toString();
                    System.out.println("Os dois primeiros caracteris são:" + fraseInvertida.charAt(0) + fraseInvertida.charAt(1));

                    break;
                case 3:
                    fraseInvertida = new StringBuilder(exer.frase).reverse().toString();
                    System.out.println(fraseInvertida);
                    break;
                case 4:
                    System.out.println("Programa finalizado");
                    break;


            }
        }
    }
}