public class Algoritmo490 {
    public static int restantes(String vet, int tam, String x) {
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            if (vet.charAt(i) == x.charAt(0)) {
                vet = vet.substring(0, i) + 'u' + vet.substring(i + 1);
                cont++;
            }
        }
        return cont;
    }
}

