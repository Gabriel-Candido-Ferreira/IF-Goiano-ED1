import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        String resposta = "";

        String[] palavras = frase.split(" ");

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < palavras.length; i++) {
            for (int j = 0; j < palavras[i].length(); j++) {
                pilha.push(palavras[i].charAt(j));
            }
            while (!pilha.isEmpty()) {
                resposta += pilha.pop();
            }
        }
        System.out.println("Frase invertida: "+resposta);

        if (frase.equals(resposta)){
            System.out.println("o texto é um palíndromo");
        }else System.out.println("Não é palíndromo");
    }
}