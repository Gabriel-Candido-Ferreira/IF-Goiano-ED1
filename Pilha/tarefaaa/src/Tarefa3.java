public class Tarefa3 {
    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class CircularLinkedList {
        public Node head;
        public Object concatenate;

        public CircularLinkedList() {
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
                new_node.next = new_node;
            } else {
                new_node.next = head.next;
            }
            head = new_node;
        }

        public void concatenate(CircularLinkedList other_list) {
            if (isEmpty()) {
                head = other_list.head;
            } else if (!other_list.isEmpty()) {
                Node current = head.next;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = other_list.head.next;
                Node other_list_head = other_list.head;
                other_list.head = null;
                current.next.next = head;
                other_list_head.next = other_list_head;
            }
        }

        public CircularLinkedList mergeSorted(CircularLinkedList other_list) {
            if (isEmpty()) {
                return other_list;
            } else if (other_list.isEmpty()) {
                return this;
            }

            CircularLinkedList merged_list = new CircularLinkedList();
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

        public CircularLinkedList copy() {
            if (isEmpty()) {
                return new CircularLinkedList();
            }

            CircularLinkedList copied_list = new CircularLinkedList();
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
        public void main(String[] args) {
            CircularLinkedList list1 = new CircularLinkedList();
            CircularLinkedList list2 = new CircularLinkedList();

            list1.insertAtHead(3);
            list1.insertAtHead(5);
            list1.insertAtHead(9);

            int count = list1.countElements();
            System.out.println(count);
            // Output: 3

            list1.insertAtHead(7);


}}}
