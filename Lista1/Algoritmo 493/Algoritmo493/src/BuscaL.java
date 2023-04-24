public class BuscaL {
    public static int buscaL(int[] vet, int tam) {
        int x;
        for (int i = 0; i < tam - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                x = 0;
                return x;
            }
        }
        x = 1;
        return x;
    }
}