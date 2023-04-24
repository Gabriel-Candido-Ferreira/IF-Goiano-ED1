public class VerificaOrdem {
    public static int verificaOrdem(int[] vetor, int t) {
        int r = Algoritmo493.busca(vetor, t);
        if (r == 1) {
            return 2;
        } else {
            r = BuscaL.buscaL(vetor, t);
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}