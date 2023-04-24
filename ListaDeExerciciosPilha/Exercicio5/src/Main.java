import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> f = new LinkedList<>();
        Stack<Integer> p = new Stack<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            f.offer(rand.nextInt(100));
        }

        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(100);
            if (f.contains(num)) {
                p.push(num);
            } else {
                f.offer(num);
            }
        }

        System.out.println("Fila F:");
        for (int num : f) {
            System.out.print(num + " ");
        }

        System.out.println("\nPilha P:");
        while (!p.isEmpty()) {
            System.out.print(p.pop() + " ");
        }
    }
}
