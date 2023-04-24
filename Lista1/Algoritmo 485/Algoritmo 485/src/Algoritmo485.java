public class Algoritmo485 {
    static void multivetor(int[] vetl, String[] vet2, int tam) {
        for (int i = 0; i < tam; i++) {
            System.out.println();
            for (int w = 0; w < vetl[i]; w++) {
                System.out.print(vet2[i]);
            }
        }
        System.out.println();
    }
}
