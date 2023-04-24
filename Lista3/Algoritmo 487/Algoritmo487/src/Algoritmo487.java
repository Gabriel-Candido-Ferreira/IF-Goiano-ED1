public class Algoritmo487 {
    public static void inverte(int[] vet, int max) {
        int k = max;
        for (int i = 0; i < max / 2; i++) {
            int aux = vet[i];
            k--;
            vet[i] = vet[k];
            vet[k] = aux;
        }
    }
}