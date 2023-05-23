public class Tarefa2 {
    class Node {
        public int data;
        public Node prev;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    class DoublyLinkedList {
        public Node head;
        public Node tail;

        public DoublyLinkedList() {
            this.head = new Node(0);
            this.tail = new Node(0);
            this.head.next = this.tail;
            this.tail.prev = this.head;
        }

        public boolean isEmpty() {
            return head.next == tail;
        }

        public Node search(int data) {
            Node current = head.next;
            while (current != tail) {
                if (current.data == data) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }

        public void insert(int data) {
            Node new_node = new Node(data);
            Node last_node = tail.prev;
            last_node.next = new_node;
            new_node.prev = last_node;
            new_node.next = tail;
            tail.prev = new_node;
        }

        public void delete(int data) {
            Node node_to_delete = search(data);
            if (node_to_delete == null) {
                return;
            }
            Node prev_node = node_to_delete.prev;
            Node next_node = node_to_delete.next;
            prev_node.next = next_node;
            next_node.prev = prev_node;
        }

        public void display() {
            Node current = head.next;
            while (current != tail) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public class Main {
        public void main(String[] args) {
            DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

            doublyLinkedList.insert(3);
            doublyLinkedList.insert(5);
            doublyLinkedList.insert(9);

            doublyLinkedList.display();
            // Output: 3 5 9

            Node node = doublyLinkedList.search(5);
            System.out.println(node.data);
            // Output: 5

            node = doublyLinkedList.search(2);
            System.out.println(node);
            // Output: null

            doublyLinkedList.delete(5);
            doublyLinkedList.display();
            // Output: 3 9

            doublyLinkedList.delete(7);
            doublyLinkedList.display();
            // Output: 3 9
        }
    }
}
