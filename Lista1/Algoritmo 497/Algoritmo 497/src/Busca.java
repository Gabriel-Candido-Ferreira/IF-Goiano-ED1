public class Busca {
    public static int busca(int[] vet, int tam, int chave) {
        int inicio = 0, fim = tam-1;
        while (inicio <= fim) {
            int meio = (inicio+fim)/2;
            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio-1;
            } else {
                inicio = meio+1;
            }
        }
        return -1;
    }
}

