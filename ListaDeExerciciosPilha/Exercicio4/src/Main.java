import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        FilaInvertida fila = new FilaInvertida();

        fila.preencheFila();
        fila.printF1();

        Queue<Integer> f2 = fila.inverteFila();

        fila.printF2();
    }
}
