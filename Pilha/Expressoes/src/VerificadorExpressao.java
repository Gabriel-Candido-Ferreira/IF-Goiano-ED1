import java.util.Stack;

public class VerificadorExpressao {
    public static boolean verificarParametrizacao(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);

            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.isEmpty()) {
                    return false; // Há um fecha parênteses sem o correspondente abre parênteses
                }

                char topo = pilha.pop();
                if (!parametroCorrespondente(topo, caractere)) {
                    return false; // Os parênteses não correspondem
                }
            }
        }

        return pilha.isEmpty(); // A pilha deve estar vazia para que a expressão seja correta
    }

    public static boolean parametroCorrespondente(char abre, char fecha) {
        return (abre == '(' && fecha == ')') || (abre == '[' && fecha == ']') || (abre == '{' && fecha == '}');
    }
}
