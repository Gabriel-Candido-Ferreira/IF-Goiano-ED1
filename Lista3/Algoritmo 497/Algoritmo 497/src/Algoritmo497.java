public class Algoritmo497 {

    public static void ordena(int[] vet, int tam) {
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i] > vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
    }
}
