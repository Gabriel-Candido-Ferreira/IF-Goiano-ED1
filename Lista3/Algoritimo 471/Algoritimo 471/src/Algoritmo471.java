public class Algoritmo471 {
    public static int divisor(int x, int y) {
        int r, nl = 0;
        r = x % y;
        while (r == 0) {
            nl++;
            x = x / y;
            r = x % y;
        }
        return nl;
    }
}
