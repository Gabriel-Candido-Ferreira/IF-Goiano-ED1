public class Algoritmo495 {
    public static void ordena(String[] vet) {
        int tam = vet.length;
        String aux;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (vet[i].compareToIgnoreCase(vet[j]) > 0) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}

