import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Pilha pPositivos = new Pilha();
        Pilha pNegativos = new Pilha();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int num = rand.nextInt(201) - 100; // gera número entre -100 e 100
            if (num > 0) {
                pPositivos.empilha(num);
            } else if (num < 0) {
                pNegativos.empilha(num);
            } else { // num == 0
                if (!pPositivos.estaVazia() && !pNegativos.estaVazia()) {
                    int numPositivo = (int) pPositivos.desempilha();
                    int numNegativo = (int) pNegativos.desempilha();
                    System.out.println("Número positivo retirado da pilha P: " + numPositivo);
                    System.out.println("Número negativo retirado da pilha N: " + numNegativo);
                }
            }
        }
    }
}
