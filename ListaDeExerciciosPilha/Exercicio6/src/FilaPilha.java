import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class FilaPilha {
    private Queue<Integer> fila;
    private Stack<Integer> pilha;

    public FilaPilha() {
        fila = new LinkedList<>();
        pilha = new Stack<>();
    }

    public void preencherFila(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(2001) - 1000;
            fila.offer(num);
        }
    }

    public void processarFila() {
        while (!fila.isEmpty()) {
            int num = fila.peek();
            if (num >= 0) {
                fila.poll();
                pilha.push(num);
            } else {
                if (!pilha.isEmpty()) {
                    int topo = pilha.pop();
                    System.out.println("Topo da pilha: " + topo);
                }
                fila.poll();
            }
        }
    }

    public void imprimirFila() {
        System.out.println("Fila: " + fila);
    }

    public void imprimirPilha() {
        System.out.println("Pilha: " + pilha);
    }
}
