import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FilaInvertida {
    private Queue<Integer> f1;
    private Queue<Integer> f2;

    public FilaInvertida() {
        f1 = new LinkedList<>();
        f2 = new LinkedList<>();
    }

    public void preencheFila() {
        Random rand = new Random();

        // Preenche a fila F1 com 100 números aleatórios
        for (int i = 0; i < 100; i++) {
            f1.offer(rand.nextInt(1000));
        }
    }

    public Queue<Integer> inverteFila() {
        Stack<Integer> pilha = new Stack<>();

        // Empilha os elementos de F1 na pilha
        while (!f1.isEmpty()) {
            pilha.push(f1.poll());
        }

        // Desempilha os elementos da pilha em F2
        while (!pilha.isEmpty()) {
            f2.offer(pilha.pop());
        }

        return f2;
    }

    public void printF1() {
        System.out.println("F1: " + f1);
    }

    public void printF2() {
        System.out.println("F2 (F1 invertida): " + f2);
    }
}
