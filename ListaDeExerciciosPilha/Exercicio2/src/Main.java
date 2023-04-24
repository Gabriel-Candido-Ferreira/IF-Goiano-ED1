import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }

        System.out.print("Digite a chave a ser removida: ");
        char chave = sc.nextLine().charAt(0);

        Stack<Character> pilhaAux = new Stack<>();

        while (!pilha.isEmpty()) {
            char c = pilha.pop();
            if (c != chave) {
                pilhaAux.push(c);
            }
        }

        while (!pilhaAux.isEmpty()) {
            pilha.push(pilhaAux.pop());
        }

        System.out.print("Resposta: ");
        for (char c : pilha) {
            System.out.print(c);
        }
    }
}
