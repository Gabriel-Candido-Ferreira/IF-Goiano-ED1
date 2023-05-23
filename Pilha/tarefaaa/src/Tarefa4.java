public class Tarefa4 {
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

    class CircularDoublyLinkedList {
        public Node head;

        public CircularDoublyLinkedList() {
            this.head = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public int countElements() {
            if (isEmpty()) {
                return 0;
            }
            int count = 1;
            Node current = head.next;
            while (current != head) {
                count++;
                current = current.next;
            }
            return count;
        }

        public void insertAtHead(int data) {
            Node new_node = new Node(data);
            if (isEmpty()) {
                new_node.prev = new_node;
                new_node.next = new_node;
            } else {
                Node last_node = head.prev;
                new_node.next = head;
                head.prev = new_node;
                new_node.prev = last_node;
                last_node.next = new_node;
            }
            head = new_node;
        }

        public void concatenate(CircularDoublyLinkedList other_list) {
            if (isEmpty()) {
                head = other_list.head;
            } else if (!other_list.isEmpty()) {
                Node last_self = head.prev;
                Node first_other = other_list.head.next;
                Node last_other = other_list.head.prev;

                last_self.next = first_other;
                first_other.prev = last_self;

                last_other.next = head;
                head.prev = last_other;

                other_list.head = null;
            }
        }

        public CircularDoublyLinkedList mergeSorted(CircularDoublyLinkedList other_list) {
            if (isEmpty()) {
                return other_list;
            } else if (other_list.isEmpty()) {
                return this;
            }

            CircularDoublyLinkedList merged_list = new CircularDoublyLinkedList();
            Node current_self = head;
            Node current_other = other_list.head;

            while (true) {
                if (current_self.data <= current_other.data) {
                    merged_list.insertAtHead(current_self.data);
                    current_self = current_self.next;
                } else {
                    merged_list.insertAtHead(current_other.data);
                    current_other = current_other.next;
                }

                if (current_self == head) {
                    while (current_other != other_list.head) {
                        merged_list.insertAtHead(current_other.data);
                        current_other = current_other.next;
                    }
                    break;
                } else if (current_other == other_list.head) {
                    while (current_self != head) {
                        merged_list.insertAtHead(current_self.data);
                        current_self = current_self.next;
                    }
                    break;
                }
            }

            return merged_list;
        }

        public CircularDoublyLinkedList copy() {
            if (isEmpty()) {
                return new CircularDoublyLinkedList();
            }

            CircularDoublyLinkedList copied_list = new CircularDoublyLinkedList();
            Node current = head;
            while (true) {
                copied_list.insertAtHead(current.data);
                current = current.next;
                if (current == head) {
                    break;
                }
            }

            return copied_list;
        }

        public void display() {
            if (isEmpty()) {
                return;
            }
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public class Main {
        public static void main(String[] args) {
}}}
