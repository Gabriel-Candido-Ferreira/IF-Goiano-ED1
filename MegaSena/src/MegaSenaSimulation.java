import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public List<Integer> findOccurrences(int[] sequence) {
        Node current = head;
        List<Integer> occurrences = new ArrayList<>();

        int index = 0;
        int startPosition = 0;

        while (current != null) {
            if (current.data == sequence[index]) {
                if (index == 0) {
                    startPosition = current.data;
                }

                index++;

                if (index == sequence.length) {
                    occurrences.add(startPosition);
                    index = 0;
                }
            } else {
                index = 0;
            }

            current = current.next;
        }

        return occurrences;
    }

    public List<Integer> findOccurrencesReverse(int[] sequence) {
        Node current = tail;
        List<Integer> occurrences = new ArrayList<>();

        int index = 0;
        int startPosition = 0;

        while (current != null) {
            if (current.data == sequence[index]) {
                if (index == 0) {
                    startPosition = current.data;
                }

                index++;

                if (index == sequence.length) {
                    occurrences.add(startPosition);
                    index = 0;
                }
            } else {
                index = 0;
            }

            current = current.prev;
        }

        return occurrences;
    }
}

public class MegaSenaSimulation {
    public static void main(String[] args) {
        int quantidade = 51000000;
        int[] numeros = new int[quantidade];
        int[] sequencia = {1, 15, 16, 25, 32, 36};

        Random random = new Random();
        DoublyLinkedList lista = new DoublyLinkedList();

        // Gerar números aleatórios e armazená-los na lista
        for (int i = 0; i < quantidade; i++) {
            int numero = random.nextInt(60) + 1;
            numeros[i] = numero;
            lista.add(numero);
        }

        // Verificar ocorrências da sequência na ordem padrão
        List<Integer> ocorrenciasOrdemPadrao = lista.findOccurrences(sequencia);

        // Inverter a sequência para verificar ocorrências na ordem inversa
        int[] sequenciaInvertida = {sequencia[5], sequencia[4], sequencia[3], sequencia[2], sequencia[1], sequencia[0]};
        List<Integer> ocorrenciasOrdemInversa = lista.findOccurrencesReverse(sequenciaInvertida);

        System.out.println("Ocorrências da sequência na ordem padrão: " + ocorrenciasOrdemPadrao.size());
        System.out.println("Posições da sequência na ordem padrão: " + ocorrenciasOrdemPadrao);

        System.out.println("Ocorrências da sequência na ordem inversa: " + ocorrenciasOrdemInversa.size());
        System.out.println("Posições da sequência na ordem inversa: " + ocorrenciasOrdemInversa);
    }
}
