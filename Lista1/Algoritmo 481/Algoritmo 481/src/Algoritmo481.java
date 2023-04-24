public class Algoritmo481 {

    public static int converte(int nnum, int nbase) {
        int nb = 0, r, b = 0;

        while (nnum >= nbase) {
            r = nnum % nbase;
            nb += Math.pow(10, b) * r;
            nnum = nnum / nbase;
            b++;
        }

        nb += Math.pow(10, b) * nnum;

        return nb;
    }
}
