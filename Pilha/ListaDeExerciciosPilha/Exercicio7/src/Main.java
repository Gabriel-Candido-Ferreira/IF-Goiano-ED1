import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 1; i <= 20; i++) {
            fila.offer(i);
        }

        System.out.println("Fila original: " + fila);
        inverteFila(fila);
        System.out.println("Fila invertida: " + fila);
    }

    public static void inverteFila(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }

}