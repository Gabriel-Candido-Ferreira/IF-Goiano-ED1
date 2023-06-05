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
            Node current = head;
            while (current != null && current.data < newNode.data) {
                current = current.next;
            }

            if (current == head) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else if (current == null) {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            } else {
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }

        size++;
    }

    public void removePrimes() {
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            if (isPrime(current.data)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
            current = nextNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class RandomNumbers {
    public static void main(String[] args) {
        int quantidade = 1000;
        int[] numeros = new int[quantidade];

        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = random.nextInt(1999) - 999;
        }

        System.out.println("Vetor de números aleatórios:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        DoublyLinkedList lista = new DoublyLinkedList();
        for (int i = 0; i < quantidade; i++) {
            lista.add(numeros[i]);
        }

        System.out.println("Lista de números em ordem crescente:");
        lista.printList();

        System.out.println("Lista de números em ordem decrescente:");
        lista.printReverse();

        lista.removePrimes();
        System.out.println("Lista sem números primos:");
        lista.printList();
    }
}
