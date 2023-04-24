import java.util.Stack;

public class Pilha {

    private String exemplo1;
    private String exemplo2;

    public Pilha(String exemplo1, String exemplo2) {
        this.exemplo1 = exemplo1;
        this.exemplo2 = exemplo2;
    }

    public String getExemplo1() {
        return exemplo1;
    }

    public void setExemplo1(String exemplo1) {
        this.exemplo1 = exemplo1;
    }

    public String getExemplo2() {
        return exemplo2;
    }

    public void setExemplo2(String exemplo2) {
        this.exemplo2 = exemplo2;
    }

    public boolean  inverteString(String s[]) {
        Stack<Character> pilha = new Stack<>();

            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].length(); j++) {
                    pilha.push(s[i].charAt(j)); // Empilha os caracteres de cada palavra
                }
                 while (!pilha.isEmpty()) {
                   System.out.print(pilha.pop()); // Desempilha os caracteres e imprime na ordem inversa
                }
                System.out.print(" "); // Adiciona um espaço entre as palavras
            }
            return true;
        }
    }

