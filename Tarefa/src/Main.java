import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static Pessoa criarPessoa(int ID) {
        Random random = new Random();
        String[] sexos = {"M", "F"};
        String[] booleans = {"s", "n"};

        String sexo = sexos[random.nextInt(sexos.length)];
        int idade = random.nextInt(83) + 18; // Random between 18 and 100
        String gestante = booleans[random.nextInt(booleans.length)];
        String lactante = booleans[random.nextInt(booleans.length)];
        String necessidade_especial = booleans[random.nextInt(booleans.length)];

        int prioridade = 0;

        if (gestante.equals("s") || lactante.equals("s")) {
            prioridade = 3;
        } else if (necessidade_especial.equals("s")) {
            prioridade = 2;
        } else if (idade >= 60) {
            prioridade = 1;
        }

        return new Pessoa(ID, sexo, idade, gestante, lactante, necessidade_especial, prioridade);
    }

    public static void main(String[] args) {
        Deque<Pessoa> filaAtendimento = new LinkedList<>();

        // Criar grupos de 10 pessoas
        for (int i = 0; i < 10; i++) {
            List<Pessoa> grupo = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                Pessoa pessoa = criarPessoa(i * 10 + j + 1);
                grupo.add(pessoa);
            }

            // Ordenar o grupo de acordo com a prioridade (3, 2, 1, 0)
            Collections.sort(grupo, new Comparator<Pessoa>() {
                @Override
                public int compare(Pessoa p1, Pessoa p2) {
                    if (p1.getPrioridade() == p2.getPrioridade()) {
                        return Integer.compare(p2.getID(), p1.getID());
                    } else {
                        return Integer.compare(p2.getPrioridade(), p1.getPrioridade());
                    }
                }
            });

            // Adicionar as pessoas do grupo à fila de atendimento
            filaAtendimento.addAll(grupo);
        }

        // Exibir a fila de atendimento
        for (Pessoa pessoa : filaAtendimento) {
            System.out.println("ID: " + pessoa.getID() +
                    ", Prioridade: " + pessoa.getPrioridade());
        }
    }
}
