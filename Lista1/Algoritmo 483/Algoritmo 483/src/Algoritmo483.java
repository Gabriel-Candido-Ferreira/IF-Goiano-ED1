public class Algoritmo483 {
    public static int produtointerno(int[] vetl, int[] vet2, int quant) {
        int prod = 0;
        for(int i = 0; i < quant; i++) {
            prod += (vetl[i] * vet2[i]);
        }
        return prod;
    }
}
