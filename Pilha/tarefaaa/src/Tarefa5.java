public class Tarefa5 {
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

        public CircularLinkedList() {
            this.head = new Node(-1);
        }

        public boolean isEmpty() {
            return this.head.next == null;
        }

        public int countElements() {
            if (isEmpty()) {
                return 0;
            }
            int count = 0;
            Node current = this.head.next;
            do {
                count++;
                current = current.next;
            } while (current != this.head.next);
            return count;
        }

        public void insertAtHead(int data) {
            Node new_node = new Node(data);
            if (isEmpty()) {
                new_node.next = new_node;
            } else {
                Node last_node = this.head.next;
                new_node.next = last_node;
                while (last_node.next != this.head.next) {
                    last_node = last_node.next;
                }
                last_node.next = new_node;
            }
            this.head.next = new_node;
        }

        public void concatenate(CircularLinkedList other_list) {
            if (isEmpty()) {
                this.head.next = other_list.head.next;
            } else if (!other_list.isEmpty()) {
                Node last_self = this.head.next;
                while (last_self.next != this.head.next) {
                    last_self = last_self.next;
                }
                last_self.next = other_list.head.next;
                Node last_other = other_list.head.next;
                while (last_other.next != other_list.head.next) {
                    last_other = last_other.next;
                }
                last_other.next = this.head.next;
                other_list.head.next = other_list.head;
            }
        }

        public CircularLinkedList mergeSorted(CircularLinkedList other_list) {
            if (isEmpty()) {
                return other_list;
            } else if (other_list.isEmpty()) {
                return this;
            }

            CircularLinkedList merged_list = new CircularLinkedList();
            Node current_self = this.head.next;
            Node current_other = other_list.head.next;

            while (true) {
                if (current_self.data <= current_other.data) {
                    merged_list.insertAtHead(current_self.data);
                    current_self = current_self.next;
                } else {
                    merged_list.insertAtHead(current_other.data);
                    current_other = current_other.next;
                }

                if (current_self == this.head.next) {
                    while (current_other != other_list.head.next) {
                        merged_list.insertAtHead(current_other.data);
                        current_other = current_other.next;
                    }
                    break;
                } else if (current_other == other_list.head.next) {
                    while (current_self != this.head.next) {
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
            Node current = this.head.next;
            do {
                copied_list.insertAtHead(current.data);
                current = current.next;
            } while (current != this.head.next);

            return copied_list;
        }

        public void display() {
            if (isEmpty()) {
                return;
            }
            Node current = this.head.next;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != this.head.next);
            System.out.println();
        }
    }
}