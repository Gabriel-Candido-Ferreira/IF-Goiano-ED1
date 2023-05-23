public class tarefa1 {
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
            this.head = null;
            this.tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void append(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void prepend(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void concatenate(DoublyLinkedList otherList) {
            if (otherList.isEmpty()) {
                return;
            }
            if (isEmpty()) {
                head = otherList.head;
                tail = otherList.tail;
            } else {
                tail.next = otherList.head;
                otherList.head.prev = tail;
                tail = otherList.tail;
            }
        }

        public DoublyLinkedList[] split() {
            if (isEmpty() || head == tail) {
                return new DoublyLinkedList[]{this, null};
            }
            Node slowPtr = head;
            Node fastPtr = head;
            while (fastPtr.next != null && fastPtr.next.next != null) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }

            DoublyLinkedList secondList = new DoublyLinkedList();
            secondList.head = slowPtr.next;
            secondList.head.prev = null;
            secondList.tail = tail;
            tail = slowPtr;
            slowPtr.next = null;

            return new DoublyLinkedList[]{this, secondList};
        }

        public DoublyLinkedList mergeSorted(DoublyLinkedList otherList) {
            if (otherList.isEmpty()) {
                return this;
            }

            DoublyLinkedList mergedList = new DoublyLinkedList();
            Node currentSelf = head;
            Node currentOther = otherList.head;

            while (currentSelf != null && currentOther != null) {
                if (currentSelf.data <= currentOther.data) {
                    mergedList.append(currentSelf.data);
                    currentSelf = currentSelf.next;
                } else {
                    mergedList.append(currentOther.data);
                    currentOther = currentOther.next;
                }
            }

            while (currentSelf != null) {
                mergedList.append(currentSelf.data);
                currentSelf = currentSelf.next;
            }

            while (currentOther != null) {
                mergedList.append(currentOther.data);
                currentOther = currentOther.next;
            }

            return mergedList;
        }
    }

    public class Main {
        public void main(String[] args) {
            DoublyLinkedList list1 = new DoublyLinkedList();
            DoublyLinkedList list2 = new DoublyLinkedList();

            list1.append(3);
            list1.append(5);
            list1.append(9);

            list2.append(2);
            list2.append(4);
            list2.append(7);

            list1.concatenate(list2);

            Node current = list1.head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            // Output: 3 5 9 2

        }
    }}
